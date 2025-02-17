package ru.netren.binlist.ui.screens.bininfoscreen.bininfo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ru.netren.binlist.repository.models.Number

@Composable
fun Number(number: Number) {
    Card {
        Column {
            Text(
                text = "CARD NUMBER",
                color = Color.Gray
            )
            Row {
                Column {
                    Text(
                        text = "LENGTH",
                        color = Color.Gray
                    )
                    Text(text = number.length.toString())
                }

                Spacer(
                    modifier = Modifier.width(10.dp)
                )

                Column {
                    Text(
                        text = "LUHN",
                        color = Color.Gray
                    )

                    Row {
                        if (number.luhn) {
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
    }
}