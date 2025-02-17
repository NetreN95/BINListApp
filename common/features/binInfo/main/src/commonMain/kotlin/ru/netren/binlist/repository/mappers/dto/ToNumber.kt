package ru.netren.binlist.repository.mappers.dto

import ru.netren.binlist.network.models.NumberDTO
import ru.netren.binlist.repository.models.Number

fun NumberDTO.toNumber(): Number {
    return Number(
        length = this.length,
        luhn = this.luhn
    )
}