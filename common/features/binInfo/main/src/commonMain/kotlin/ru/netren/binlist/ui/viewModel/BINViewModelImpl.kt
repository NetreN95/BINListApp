package ru.netren.binlist.ui.viewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import ru.netren.binlist.repository.BINRepository
import ru.netren.binlist.repository.models.BINInfo

class BINViewModelImpl(
    private val BINRepository: BINRepository
) : BINViewModel() {
    private val _binInput: MutableState<String> = mutableStateOf("")
    override val binInput: State<String>
        get() = _binInput

    private val _binInfo: MutableStateFlow<BINInfo?> = MutableStateFlow(null)
    override val binInfo: StateFlow<BINInfo?>
        get() = _binInfo

    private val _binInfoArchive: MutableStateFlow<List<BINInfo>> = MutableStateFlow(listOf())
    override val binInfoArchive: StateFlow<List<BINInfo>>
        get() = _binInfoArchive

    private val _screenState: MutableState<BINScreenState> = mutableStateOf(BINScreenState.MAIN)
    override val screenState: State<BINScreenState>
        get() = _screenState

    init {
        viewModelScope.launch(Dispatchers.Default) {
            BINRepository.getArchive().collect {
                _binInfoArchive.value = it
            }
        }
    }

    override fun onClickGetBINInfo() {
        getInfoByBIN()
    }

    override fun onClickChangeScreen(binScreenState: BINScreenState) {
        _screenState.value = binScreenState
    }

    override fun onBINChange(bin: String) {
        _binInput.value = bin
    }

    private fun getInfoByBIN() {
        if (binInput.value.isEmpty()) {
            return
        }
        viewModelScope.launch(Dispatchers.Default) {
            _binInfo.value = null
            val result = BINRepository.getInfoByBIN(binInput.value.toInt())
            _binInfo.value = result.data
        }
    }
}