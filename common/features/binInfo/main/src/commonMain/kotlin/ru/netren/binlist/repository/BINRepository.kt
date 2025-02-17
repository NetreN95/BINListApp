package ru.netren.binlist.repository

import dev.androidbroadcast.RequestResult
import kotlinx.coroutines.flow.Flow
import ru.netren.binlist.repository.models.BINInfo

interface BINRepository {
    suspend fun getInfoByBIN(bin: Int): RequestResult<BINInfo>
    suspend fun getArchive(): Flow<List<BINInfo>>
}