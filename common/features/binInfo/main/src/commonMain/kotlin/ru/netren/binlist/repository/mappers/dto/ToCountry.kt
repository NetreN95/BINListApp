package ru.netren.binlist.repository.mappers.dto

import ru.netren.binlist.network.models.CountryDTO
import ru.netren.binlist.repository.models.Country

fun CountryDTO.toCountry(): Country {
    return Country(
        numeric = this.numeric,
        alpha2 = this.alpha2,
        name = this.name,
        emoji = this.emoji,
        currency = this.currency,
        latitude = this.latitude,
        longitude = this.longitude,
    )
}