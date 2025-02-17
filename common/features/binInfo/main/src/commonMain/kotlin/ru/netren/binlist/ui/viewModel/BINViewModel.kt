package ru.netren.binlist.ui.viewModel

import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow
import ru.netren.binlist.repository.models.BINInfo

abstract class BINViewModel : ViewModel() {
    abstract val binInput: State<String>
    abstract val binInfo: StateFlow<BINInfo?>
    abstract val binInfoArchive: StateFlow<List<BINInfo>>
    abstract val screenState: State<BINScreenState>

    abstract fun onClickGetBINInfo()
    abstract fun onClickChangeScreen(binScreenState: BINScreenState)
    abstract fun onBINChange(bin: String)
}