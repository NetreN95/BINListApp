package ru.netren.binlist.ui.screens.bininfoscreen.bininfo

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import ru.netren.binlist.repository.models.Bank

@Composable
fun Bank(bank: Bank) {
    Card {
        Column {
            Text(
                text = "BANK",
                color = Color.Gray
            )

            Text(
                text = "${bank.name}, ${bank.city}",
                fontSize = 16.sp
            )

            Text(
                text = bank.url,
                color = Color.Blue
            )

            Text(
                text = bank.phone,
                color = Color.Blue
            )
        }
    }
}