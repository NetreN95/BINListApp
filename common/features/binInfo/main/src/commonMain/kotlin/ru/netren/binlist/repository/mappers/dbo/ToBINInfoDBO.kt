package ru.netren.binlist.repository.mappers.dbo

import ru.netren.binlist.db.BINInfoDBO
import ru.netren.binlist.repository.models.BINInfo

fun BINInfo.toBINInfoDBO(): BINInfoDBO {
    return BINInfoDBO(
        id = 0,
        bin = this.bin.toLong(),
        scheme = this.scheme,
        type = this.type,
        brand = this.brand,
        prepaid = this.prepaid,

        bank_name = this.bank?.name ?: "",
        bank_url = this.bank?.url ?: "",
        bank_phone = this.bank?.phone ?: "",
        bank_city = this.bank?.city ?: "",

        number_length = this.number?.length?.toLong() ?: 0,
        number_luhn = this.number?.luhn ?: false,

        country_numeric = this.country?.numeric?.toLong() ?: 0,
        country_alpha2 = this.country?.alpha2 ?: "",
        country_name = this.country?.name ?: "",
        country_emoji = this.country?.emoji ?: "",
        country_currency = this.country?.currency ?: "",
        country_latitude = this.country?.latitude?.toLong() ?: 0,
        country_longitude = this.country?.longitude?.toLong() ?: 0
    )
}