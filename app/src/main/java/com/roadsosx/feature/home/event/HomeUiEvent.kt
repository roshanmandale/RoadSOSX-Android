package com.roadsosx.feature.home.event

sealed interface HomeUiEvent {
    object SOSClicked : HomeUiEvent
    object ContactsClicked : HomeUiEvent
    object SettingsClicked : HomeUiEvent
}
