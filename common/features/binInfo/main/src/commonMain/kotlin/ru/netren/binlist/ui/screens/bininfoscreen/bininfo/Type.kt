package ru.netren.binlist.ui.screens.bininfoscreen.bininfo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun Type(type: String) {
    Card {
        Column {
            Text(
                text = "TYPE",
                color = Color.Gray
            )
            Row {
                when (type.lowercase()) {
                    "debit" -> {
                        Text(text = "Debit")
                        Text(
                            text = "/Credit",
                            color = Color.Gray
                        )
                    }

                    "credit" -> {
                        Text(
                            text = "Debit/",
                            color = Color.Gray
                        )
                        Text(text = "Credit")
                    }

                    else -> {
                        Text(text = type)
                    }
                }
            }


        }
    }
}