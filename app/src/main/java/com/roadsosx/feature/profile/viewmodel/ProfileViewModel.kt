package com.roadsosx.feature.profile.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.roadsosx.domain.repository.ProfileRepository
import com.roadsosx.feature.profile.state.ProfileUiState

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val profileRepository: ProfileRepository
) : ViewModel() {

    private val _state = MutableStateFlow(ProfileUiState())
    val state: StateFlow<ProfileUiState> = _state.asStateFlow()

    fun updateProfile(name: String, phoneNumber: String) {
        viewModelScope.launch {
            // Trigger profileRepository.updateProfile(...)
        }
    }

    fun uploadAvatar(imageBytes: ByteArray) {
        viewModelScope.launch {
            // Trigger profileRepository.uploadProfilePicture(...)
        }
    }
}
