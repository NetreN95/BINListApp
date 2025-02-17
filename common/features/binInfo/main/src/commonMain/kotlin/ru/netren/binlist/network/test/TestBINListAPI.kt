package ru.netren.binlist.network.test

import ru.netren.binlist.network.retrofit.BINListAPI
import ru.netren.network.retrofit.Retrofit

internal const val TEST_BASE_URL_BIN_LIST_NET = "http://192.168.0.5:8080/"
fun testBINListAPI(): BINListAPI {
    return Retrofit(TEST_BASE_URL_BIN_LIST_NET).create(BINListAPI::class.java)
}