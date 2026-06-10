package com.roadsosx.feature.settings.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.roadsosx.domain.repository.SettingsRepository
import com.roadsosx.feature.settings.state.SettingsUiState

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val settingsRepository: SettingsRepository
) : ViewModel() {

    private val _state = MutableStateFlow(SettingsUiState())
    val state: StateFlow<SettingsUiState> = _state.asStateFlow()

    fun toggleDarkMode(enabled: Boolean) {
        viewModelScope.launch {
            // Trigger settingsRepository.setDarkModeThemeEnabled(enabled)
        }
    }

    fun changeLanguage(languageCode: String) {
        viewModelScope.launch {
            // Trigger settingsRepository.setLanguagePreference(languageCode)
        }
    }
}
