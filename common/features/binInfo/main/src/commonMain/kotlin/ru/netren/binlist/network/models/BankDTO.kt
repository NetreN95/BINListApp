package ru.netren.binlist.network.models

import com.google.gson.annotations.SerializedName

data class BankDTO(
    @SerializedName("name")
    val name: String = "",

    @SerializedName("url")
    val url: String = "",

    @SerializedName("phone")
    val phone: String = "",

    @SerializedName("city")
    val city: String = ""
)
