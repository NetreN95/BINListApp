package ru.netren.binlist.repository.mappers.dto

import ru.netren.binlist.network.models.BINInfoDTO
import ru.netren.binlist.repository.models.BINInfo

fun BINInfoDTO.toBINInfo(bin: Int): BINInfo {
    return BINInfo(
        bin = bin,
        number = this.number?.toNumber(),
        scheme = this.scheme ?: "",
        type = this.type ?: "",
        brand = this.brand ?: "",
        prepaid = this.prepaid ?: false,
        country = this.country?.toCountry(),
        bank = this.bank?.toBank(),
    )
}