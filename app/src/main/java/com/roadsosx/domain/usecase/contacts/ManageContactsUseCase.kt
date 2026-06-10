package com.roadsosx.domain.usecase.contacts

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.model.EmergencyContact
import com.roadsosx.domain.repository.ContactsRepository

class ManageContactsUseCase @Inject constructor(
    private val repository: ContactsRepository
) {
    fun getContacts(): Flow<Resource<List<EmergencyContact>>> {
        return repository.getEmergencyContacts()
    }

    fun addContact(name: String, phoneNumber: String, relationship: String?): Flow<Resource<EmergencyContact>> {
        return repository.addContact(name, phoneNumber, relationship)
    }

    fun updateContact(contactId: String, name: String, phoneNumber: String, relationship: String?): Flow<Resource<EmergencyContact>> {
        return repository.updateContact(contactId, name, phoneNumber, relationship)
    }

    fun deleteContact(contactId: String): Flow<Resource<Unit>> {
        return repository.deleteContact(contactId)
    }
}
