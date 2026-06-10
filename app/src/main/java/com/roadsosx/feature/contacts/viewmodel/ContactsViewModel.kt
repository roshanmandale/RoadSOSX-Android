package com.roadsosx.feature.contacts.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.roadsosx.domain.usecase.contacts.ManageContactsUseCase
import com.roadsosx.feature.contacts.state.ContactsUiState

@HiltViewModel
class ContactsViewModel @Inject constructor(
    private val manageContactsUseCase: ManageContactsUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(ContactsUiState())
    val state: StateFlow<ContactsUiState> = _state.asStateFlow()

    fun loadContacts() {
        viewModelScope.launch {
            // Trigger manageContactsUseCase.getContacts()
        }
    }

    fun addContact(name: String, phoneNumber: String, relationship: String?) {
        viewModelScope.launch {
            // Trigger manageContactsUseCase.addContact(...)
        }
    }

    fun deleteContact(contactId: String) {
        viewModelScope.launch {
            // Trigger manageContactsUseCase.deleteContact(...)
        }
    }
}
