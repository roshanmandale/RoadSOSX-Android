package com.roadsosx.feature.auth.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.roadsosx.domain.usecase.auth.LoginUseCase
import com.roadsosx.domain.usecase.auth.RegisterUseCase
import com.roadsosx.feature.auth.state.AuthUiState

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase,
    private val registerUseCase: RegisterUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(AuthUiState())
    val state: StateFlow<AuthUiState> = _state.asStateFlow()

    fun login(email: String, password: String) {
        viewModelScope.launch {
            // Trigger loginUseCase
        }
    }

    fun register(name: String, email: String, password: String) {
        viewModelScope.launch {
            // Trigger registerUseCase
        }
    }
}
