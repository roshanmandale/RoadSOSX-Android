package com.roadsosx.feature.auth.state

import com.roadsosx.domain.model.User

data class AuthUiState(
    val isLoading: Boolean = false,
    val user: User? = null,
    val error: String? = null
)
