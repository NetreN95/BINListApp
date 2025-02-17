package ru.netren.binlist.ui.screens.bininfoscreen.bininfo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun Prepaid(prepaid: Boolean) {
    Card {
        Column {
            Text(
                text = "PREPAID",
                color = Color.Gray
            )

            Row {
                if (prepaid) {
                    Text(text = "Yes")
                    Text(
                        text = "/No",
                        color = Color.Gray
                    )
                } else {
                    Text(
                        text = "Yes/",
                        color = Color.Gray
                    )
                    Text(text = "No")
                }
            }
        }
    }
}