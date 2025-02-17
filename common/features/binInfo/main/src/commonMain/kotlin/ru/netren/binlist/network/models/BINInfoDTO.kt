package ru.netren.binlist.network.models

import com.google.gson.annotations.SerializedName

data class BINInfoDTO(
    @SerializedName("number")
    val number: NumberDTO?,

    @SerializedName("scheme")
    val scheme: String?,

    @SerializedName("type")
    val type: String?,

    @SerializedName("brand")
    val brand: String?,

    @SerializedName("prepaid")
    val prepaid: Boolean?,

    @SerializedName("country")
    val country: CountryDTO?,

    @SerializedName("bank")
    val bank: BankDTO?
)
