package cc.elgato

import androidx.lifecycle.ViewModel
import cc.elgato.domain.DummyRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DummyViewModel @Inject constructor(private val repo: DummyRepo): ViewModel() {
}