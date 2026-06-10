package com.roadsosx.feature.auth.event

sealed interface AuthUiEvent {
    data class EmailChanged(val email: String) : AuthUiEvent
    data class PasswordChanged(val password: String) : AuthUiEvent
    object LoginClicked : AuthUiEvent
    object RegisterClicked : AuthUiEvent
}
