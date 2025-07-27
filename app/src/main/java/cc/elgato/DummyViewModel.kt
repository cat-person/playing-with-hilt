package cc.elgato

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cc.elgato.domain.DummyRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DummyViewModel @Inject constructor(private val repo: DummyRepo): ViewModel() {
    public data class State (val text: String)

    private val _state = MutableStateFlow(State("NOTHING"))
    val state: StateFlow<State> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            try {
                _state.value = State(repo.get())
            } catch (e: Exception) {
                _state.value = State(e.message ?: "Unknown error")
            }
        }
    }
}