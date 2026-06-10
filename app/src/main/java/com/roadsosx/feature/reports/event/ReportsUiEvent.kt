package com.roadsosx.feature.reports.event

sealed interface ReportsUiEvent {
    object SubmitReport : ReportsUiEvent
    data class DescriptionChanged(val description: String) : ReportsUiEvent
}
