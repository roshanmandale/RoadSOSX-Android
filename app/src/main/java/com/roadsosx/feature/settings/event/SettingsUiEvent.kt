package com.roadsosx.feature.settings.event

sealed interface SettingsUiEvent {
    data class DarkModeToggled(val enabled: Boolean) : SettingsUiEvent
    data class LanguageSelected(val languageCode: String) : SettingsUiEvent
}
