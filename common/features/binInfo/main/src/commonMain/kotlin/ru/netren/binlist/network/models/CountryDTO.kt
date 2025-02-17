package ru.netren.binlist.network.models

import com.google.gson.annotations.SerializedName

data class CountryDTO(
    @SerializedName("numeric")
    val numeric: Int = 0,

    @SerializedName("alpha2")
    val alpha2: String = "",

    @SerializedName("name")
    val name: String = "",

    @SerializedName("emoji")
    val emoji: String = "",

    @SerializedName("currency")
    val currency: String = "",

    @SerializedName("latitude")
    val latitude: Int = 0,

    @SerializedName("longitude")
    val longitude: Int = 0
)
