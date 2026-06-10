package com.roadsosx.feature.profile.event

sealed interface ProfileUiEvent {
    data class NameChanged(val name: String) : ProfileUiEvent
    data class PhoneChanged(val phone: String) : ProfileUiEvent
    object SaveClicked : ProfileUiEvent
}
