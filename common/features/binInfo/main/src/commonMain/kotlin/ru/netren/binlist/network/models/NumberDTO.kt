package ru.netren.binlist.network.models

import com.google.gson.annotations.SerializedName

data class NumberDTO(
    @SerializedName("length")
    val length: Int = 0,

    @SerializedName("luhn")
    val luhn: Boolean = false
)
