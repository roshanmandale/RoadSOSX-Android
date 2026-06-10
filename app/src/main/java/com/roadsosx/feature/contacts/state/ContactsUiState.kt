package com.roadsosx.feature.contacts.state

import com.roadsosx.domain.model.EmergencyContact

data class ContactsUiState(
    val isLoading: Boolean = false,
    val contacts: List<EmergencyContact> = emptyList(),
    val error: String? = null
)
