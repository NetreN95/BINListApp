package ru.netren.binlist.ui.screens.bininfoscreen.bininfo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import ru.netren.binlist.repository.models.Country

@Composable
fun Country(country: Country) {
    Card {
        Column {
            Text(
                text = "COUNTRY",
                color = Color.Gray
            )
            Text(
                text = "${country.alpha2} ${country.name}"
            )
            Row {
                Text(
                    text = "(latitude: ",
                    color = Color.Gray
                )
                Text(
                    text = "${country.latitude}"
                )
                Text(
                    text = ", longitude: ",
                    color = Color.Gray
                )
                Text(
                    text = "${country.longitude}"
                )
                Text(
                    text = ")",
                    color = Color.Gray
                )
            }
        }
    }
}