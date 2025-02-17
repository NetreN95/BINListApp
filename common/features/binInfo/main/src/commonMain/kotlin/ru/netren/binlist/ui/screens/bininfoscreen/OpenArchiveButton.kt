package ru.netren.binlist.ui.screens.bininfoscreen

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Archive
import androidx.compose.runtime.Composable

@Composable
fun OpenArchiveButton(
    onClickOpenArchive: () -> Unit
) {
    IconButton(
        onClick = onClickOpenArchive,
    ) {
        Row {
            Icon(Icons.Filled.Archive, contentDescription = "Открыть архив запросов")
            Text(text = "Открыть архив")
        }
    }
}