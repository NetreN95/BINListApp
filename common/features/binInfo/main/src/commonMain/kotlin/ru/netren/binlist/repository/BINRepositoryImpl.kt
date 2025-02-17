package ru.netren.binlist.repository

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import dev.androidbroadcast.RequestResult
import dev.androidbroadcast.map
import dev.androidbroadcast.toRequestResult
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import ru.netren.binlist.db.BINInfoDBOQueries
import ru.netren.binlist.network.retrofit.BINListAPI
import ru.netren.binlist.repository.mappers.dbo.toBINInfo
import ru.netren.binlist.repository.mappers.dbo.toBINInfoDBO
import ru.netren.binlist.repository.mappers.dto.toBINInfo
import ru.netren.binlist.repository.models.BINInfo

class BINRepositoryImpl(
    private val binListAPI: BINListAPI,
    private val queries: BINInfoDBOQueries
) : BINRepository {
    override suspend fun getInfoByBIN(bin: Int): RequestResult<BINInfo> {
        val result = binListAPI.getInfoByBIN(bin = bin)
            .toRequestResult()
            .map { binInfo ->
                binInfo.toBINInfo(bin = bin)
                    .also {
                        queries.insert(
                            it.toBINInfoDBO()
                        )
                    }
            }

        return result
    }

    override suspend fun getArchive(): Flow<List<BINInfo>> {
        return queries.select()
            .asFlow()
            .mapToList(
                currentCoroutineContext()
            )
            .map { list ->
                list.map {
                    it.toBINInfo()
                }
            }
    }
}