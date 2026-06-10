package com.roadsosx.feature.contacts.event

import com.roadsosx.domain.model.EmergencyContact

sealed interface ContactsUiEvent {
    object AddContactClicked : ContactsUiEvent
    data class DeleteContactClicked(val contact: EmergencyContact) : ContactsUiEvent
}
