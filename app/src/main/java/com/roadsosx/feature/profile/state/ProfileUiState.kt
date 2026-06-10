package com.roadsosx.feature.profile.state

import com.roadsosx.domain.model.User

data class ProfileUiState(
    val isLoading: Boolean = false,
    val user: User? = null,
    val isUpdated: Boolean = false,
    val error: String? = null
)
