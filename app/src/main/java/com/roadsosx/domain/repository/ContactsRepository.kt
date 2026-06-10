package com.roadsosx.domain.repository

import kotlinx.coroutines.flow.Flow
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.model.EmergencyContact

interface ContactsRepository {
    fun getEmergencyContacts(): Flow<Resource<List<EmergencyContact>>>
    fun addContact(name: String, phoneNumber: String, relationship: String?): Flow<Resource<EmergencyContact>>
    fun updateContact(contactId: String, name: String, phoneNumber: String, relationship: String?): Flow<Resource<EmergencyContact>>
    fun deleteContact(contactId: String): Flow<Resource<Unit>>
}
