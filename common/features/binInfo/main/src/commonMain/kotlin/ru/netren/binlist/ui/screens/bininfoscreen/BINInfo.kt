package ru.netren.binlist.ui.screens.bininfoscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ru.netren.binlist.repository.models.BINInfo
import ru.netren.binlist.ui.screens.bininfoscreen.bininfo.Bank
import ru.netren.binlist.ui.screens.bininfoscreen.bininfo.Brand
import ru.netren.binlist.ui.screens.bininfoscreen.bininfo.Country
import ru.netren.binlist.ui.screens.bininfoscreen.bininfo.Number
import ru.netren.binlist.ui.screens.bininfoscreen.bininfo.Prepaid
import ru.netren.binlist.ui.screens.bininfoscreen.bininfo.Scheme
import ru.netren.binlist.ui.screens.bininfoscreen.bininfo.Type
import ru.netren.testfilms.ui.SpacerHeight
import ru.netren.testfilms.ui.SpacerWidth

@Composable
fun BINInfo(
    binInfo: BINInfo
) {
    Card {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            BIN(binInfo.bin)
            SpacerHeight()
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    if (binInfo.number != null) {
                        Number(number = binInfo.number)
                        SpacerHeight()
                    }
                    Scheme(scheme = binInfo.scheme)
                }
                SpacerWidth()
                Column {
                    Brand(brand = binInfo.brand)
                    SpacerHeight()
                    Prepaid(prepaid = binInfo.prepaid)
                    SpacerHeight()
                    Type(type = binInfo.type)
                }
            }
            SpacerHeight()
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                //SpacerWidth()
                if (binInfo.country != null) {
                    Country(country = binInfo.country)
                    SpacerWidth()
                }
                if (binInfo.bank != null) {
                    Bank(bank = binInfo.bank)
                }
            }
        }
    }
}

@Composable
fun BIN(bin: Int) {
    Card {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "BIN: ",
                color = Color.Gray
            )
            Text(text = "$bin")
        }
    }
}