package ru.netren.binlist.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ru.netren.binlist.repository.models.BINInfo
import ru.netren.binlist.ui.screens.bininfoscreen.BINInfo

@Composable
fun BINInfoArchiveScreen(
    binInfoList: List<BINInfo>,
    onClickOpenMainScreen: () -> Unit
) {
    Column(
        modifier = Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OpenMainButton(onClickOpenMainScreen = onClickOpenMainScreen)
        BINInfoArchive(binInfoList = binInfoList)
    }
}

@Composable
fun OpenMainButton(
    onClickOpenMainScreen: () -> Unit
) {
    IconButton(
        onClick = onClickOpenMainScreen,
    ) {
        Row {
            Icon(Icons.Filled.Home, contentDescription = "Домой")
            Text(text = "Домой")
        }
    }
}

@Composable
fun BINInfoArchive(
    binInfoList: List<BINInfo>
) {
    LazyColumn {
        items(count = binInfoList.size) { index ->
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .background(
                        if (index % 2 == 0) Color(0xffdddddd) else Color.Transparent
                    )
            ) {
                BINInfo(binInfo = binInfoList[index])
            }
        }
    }
}