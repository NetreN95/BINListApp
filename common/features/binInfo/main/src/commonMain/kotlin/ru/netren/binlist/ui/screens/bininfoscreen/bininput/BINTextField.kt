package ru.netren.binlist.ui.screens.bininfoscreen.bininput

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun BINTextField(
    bin: String,
    onBINChange: (String) -> Unit
) {
    TextField(
        value = bin,
        onValueChange = onBINChange,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
        maxLines = 1
    )
}