package com.roadsosx.feature.home.state

data class HomeUiState(
    val isLoading: Boolean = false,
    val isSOSActive: Boolean = false,
    val error: String? = null
)
