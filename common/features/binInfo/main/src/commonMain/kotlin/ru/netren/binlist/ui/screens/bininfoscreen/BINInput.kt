package ru.netren.binlist.ui.screens.bininfoscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.netren.binlist.ui.screens.bininfoscreen.bininput.BINTextField
import ru.netren.binlist.ui.screens.bininfoscreen.bininput.GetBINInfoButton

@Composable
fun BINInput(
    bin: String,
    onBINChange: (String) -> Unit,
    onClickGetBINInfo: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        BINTextField(
            bin = bin,
            onBINChange = onBINChange,
        )
        GetBINInfoButton(
            onClickGetBINInfo = onClickGetBINInfo
        )
    }
}