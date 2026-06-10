package com.roadsosx.feature.sos.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.roadsosx.domain.usecase.sos.CreateSOSUseCase
import com.roadsosx.feature.sos.state.SOSUiState

@HiltViewModel
class SOSViewModel @Inject constructor(
    private val createSOSUseCase: CreateSOSUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(SOSUiState())
    val state: StateFlow<SOSUiState> = _state.asStateFlow()

    fun createSOS(latitude: Double, longitude: Double, description: String?) {
        viewModelScope.launch {
            // Trigger createSOSUseCase
        }
    }
}
