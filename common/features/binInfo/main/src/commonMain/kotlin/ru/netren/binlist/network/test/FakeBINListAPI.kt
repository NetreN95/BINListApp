package ru.netren.binlist.network.test

import ru.netren.binlist.network.models.BINInfoDTO
import ru.netren.binlist.network.models.BankDTO
import ru.netren.binlist.network.models.CountryDTO
import ru.netren.binlist.network.models.NumberDTO
import ru.netren.binlist.network.retrofit.BINListAPI
import ru.netren.binlist.repository.mappers.dto.toBINInfo
import ru.netren.binlist.repository.models.BINInfo

fun fakeBINListAPI(): BINListAPI {
    return object : BINListAPI {
        override suspend fun getInfoByBIN(bin: Int): Result<BINInfoDTO> {
            return Result.success(fakeBinInfoDTO())
        }
    }
}

fun fakeBinInfoDTO(): BINInfoDTO {
    return BINInfoDTO(
        number = NumberDTO(
            length = 16,
            luhn = true
        ),
        scheme = "visa",
        type = "debit",
        brand = "Visa/Dankort",
        prepaid = false,
        country = CountryDTO(
            numeric = 208,
            alpha2 = "DK",
            name = "Denmark",
            emoji = "\uD83C\uDDE9\uD83C\uDDF0",
            currency = "DKK",
            latitude = 56,
            longitude = 10,
        ),
        bank = BankDTO(
            name = "Jyske Bank",
            url = "www.jyskebank.dk",
            phone = "+4589893300",
            city = "Hjørring"
        )
    )
}

fun fakeBinInfo(): BINInfo {
    return fakeBinInfoDTO().toBINInfo(12345678)
}