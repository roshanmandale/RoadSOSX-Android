package com.roadsosx.feature.reports.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.roadsosx.domain.usecase.reports.SubmitReportUseCase
import com.roadsosx.feature.reports.state.ReportsUiState

@HiltViewModel
class ReportsViewModel @Inject constructor(
    private val submitReportUseCase: SubmitReportUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(ReportsUiState())
    val state: StateFlow<ReportsUiState> = _state.asStateFlow()

    fun submitReport(description: String, imageBytes: ByteArray?, latitude: Double, longitude: Double) {
        viewModelScope.launch {
            // Trigger submitReportUseCase
        }
    }
}
