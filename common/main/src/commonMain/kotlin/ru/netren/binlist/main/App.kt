package ru.netren.binlist.main

import androidx.compose.runtime.Composable
import org.koin.compose.viewmodel.koinViewModel
import ru.netren.binlist.ui.screens.BINInfoScreen
import ru.netren.binlist.ui.viewModel.BINViewModel

@Composable
fun App() {
    val viewModel = koinViewModel<BINViewModel>()
    BINInfoScreen(viewModel = viewModel)
}