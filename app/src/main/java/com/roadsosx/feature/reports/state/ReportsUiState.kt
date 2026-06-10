package com.roadsosx.feature.reports.state

import com.roadsosx.domain.model.AccidentReport

data class ReportsUiState(
    val isLoading: Boolean = false,
    val reports: List<AccidentReport> = emptyList(),
    val error: String? = null
)
