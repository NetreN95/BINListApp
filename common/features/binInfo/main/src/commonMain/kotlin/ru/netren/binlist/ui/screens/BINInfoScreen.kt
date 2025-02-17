package ru.netren.binlist.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.netren.binlist.repository.models.BINInfo
import ru.netren.binlist.ui.screens.bininfoscreen.BINInfo
import ru.netren.binlist.ui.screens.bininfoscreen.BINInput
import ru.netren.binlist.ui.screens.bininfoscreen.OpenArchiveButton
import ru.netren.binlist.ui.viewModel.BINScreenState
import ru.netren.binlist.ui.viewModel.BINViewModel

@Composable
fun BINInfoScreen(
    viewModel: BINViewModel
) {
    val bin by viewModel.binInput
    val binInfo by viewModel.binInfo.collectAsState()
    val binInfoArchive by viewModel.binInfoArchive.collectAsState()

    when (viewModel.screenState.value) {
        BINScreenState.MAIN -> BINInfoScreen(
            bin = bin,
            binInfo = binInfo,
            onBINChange = { newBIN ->
                viewModel.onBINChange(bin = newBIN)
            },
            onClickGetBINInfo = {
                viewModel.onClickGetBINInfo()
            },
            onClickOpenArchive = {
                viewModel.onClickChangeScreen(
                    binScreenState = BINScreenState.ARCHIVE
                )
            }
        )


        BINScreenState.ARCHIVE -> BINInfoArchiveScreen(
            binInfoList = binInfoArchive,
            onClickOpenMainScreen = {
                viewModel.onClickChangeScreen(
                    binScreenState = BINScreenState.MAIN
                )
            }
        )
    }
}

@Composable
fun BINInfoScreen(
    bin: String,
    binInfo: BINInfo?,
    onBINChange: (String) -> Unit,
    onClickGetBINInfo: () -> Unit,
    onClickOpenArchive: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OpenArchiveButton(
            onClickOpenArchive = onClickOpenArchive
        )
        BINInput(
            bin = bin,
            onBINChange = onBINChange,
            onClickGetBINInfo = onClickGetBINInfo
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        binInfo?.let { BINInfo(binInfo = it) }
    }
}
