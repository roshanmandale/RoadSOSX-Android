package com.roadsosx.feature.sos.state

import com.roadsosx.domain.model.SOSEvent

data class SOSUiState(
    val isLoading: Boolean = false,
    val currentSOS: SOSEvent? = null,
    val error: String? = null
)
