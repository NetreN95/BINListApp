package ru.netren.binlist.network.retrofit

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import ru.netren.binlist.network.models.BINInfoDTO
import ru.netren.network.retrofit.Retrofit

internal const val BASE_URL_BIN_LIST_NET = "https://lookup.binlist.net/"

interface BINListAPI {
    @GET("{bin}")
    @Headers("Accept-Version: 3")
    suspend fun getInfoByBIN(@Path("bin") bin: Int): Result<BINInfoDTO>
}

fun BINListAPI(): BINListAPI {
    return Retrofit(BASE_URL_BIN_LIST_NET).create(BINListAPI::class.java)
}
