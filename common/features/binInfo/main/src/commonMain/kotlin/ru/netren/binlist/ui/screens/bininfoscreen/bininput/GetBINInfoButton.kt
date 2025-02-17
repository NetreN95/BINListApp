package ru.netren.binlist.ui.screens.bininfoscreen.bininput

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable

@Composable
fun GetBINInfoButton(
    onClickGetBINInfo: () -> Unit
) {
    IconButton(
        onClick = onClickGetBINInfo,
    ) {
        Icon(Icons.Filled.Search, contentDescription = "Получить информацию по БИН")
    }
}