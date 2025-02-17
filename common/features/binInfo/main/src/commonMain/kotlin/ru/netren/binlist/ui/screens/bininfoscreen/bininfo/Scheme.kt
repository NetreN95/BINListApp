package ru.netren.binlist.ui.screens.bininfoscreen.bininfo

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun Scheme(scheme: String) {
    Card {
        Column {
            Text(
                text = "SCHEME / NETWORK",
                color = Color.Gray
            )
            Text(
                text = scheme
            )
        }
    }
}