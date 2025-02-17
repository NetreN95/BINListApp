package ru.netren.binlist.repository.mappers.dto

import ru.netren.binlist.network.models.BankDTO
import ru.netren.binlist.repository.models.Bank

fun BankDTO.toBank(): Bank {
    return Bank(
        name = this.name,
        url = this.url,
        phone = this.phone,
        city = this.city
    )
}