package ru.netren.binlist.repository.models

data class BINInfo(
    val bin: Int,
    val number: Number?,
    val scheme: String,
    val type: String,
    val brand: String,
    val prepaid: Boolean,
    val country: Country?,
    val bank: Bank?
)
