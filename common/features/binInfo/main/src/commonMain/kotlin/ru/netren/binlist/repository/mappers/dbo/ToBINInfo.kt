package ru.netren.binlist.repository.mappers.dbo

import ru.netren.binlist.db.BINInfoDBO
import ru.netren.binlist.repository.models.BINInfo
import ru.netren.binlist.repository.models.Bank
import ru.netren.binlist.repository.models.Country
import ru.netren.binlist.repository.models.Number

fun BINInfoDBO.toBINInfo(): BINInfo {
    return BINInfo(
        bin = this.bin.toInt(),
        scheme = this.scheme,
        type = this.type,
        brand = this.brand,
        prepaid = this.prepaid,

        bank = Bank(
            name = this.bank_name,
            url = this.bank_url,
            phone = this.bank_phone,
            city = this.bank_city
        ),
        number = Number(
            length = this.number_length.toInt(),
            luhn = this.number_luhn
        ),
        country = Country(
            numeric = country_numeric.toInt(),
            alpha2 = this.country_alpha2,
            name = this.country_name,
            emoji = this.country_emoji,
            currency = this.country_currency,
            latitude = this.country_latitude.toInt(),
            longitude = this.country_longitude.toInt()
        )
    )
}