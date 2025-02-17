package ru.netren.binlist.ui.screens.bininfoscreen.bininfo

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun Brand(brand: String) {
    Card {
        Column {
            Text(
                text = "BRAND",
                color = Color.Gray
            )
            Text(
                text = brand
            )
        }
    }
}