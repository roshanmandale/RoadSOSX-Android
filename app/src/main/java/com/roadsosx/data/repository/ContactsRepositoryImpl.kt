package com.roadsosx.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import com.roadsosx.core.common.Resource
import com.roadsosx.data.local.dao.ContactDao
import com.roadsosx.domain.model.EmergencyContact
import com.roadsosx.domain.repository.ContactsRepository

class ContactsRepositoryImpl @Inject constructor(
    private val contactDao: ContactDao
) : ContactsRepository {

    override fun getEmergencyContacts(): Flow<Resource<List<EmergencyContact>>> = flow {
        emit(Resource.Loading)
        try {
            emit(Resource.Success(emptyList()))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }

    override fun addContact(
        name: String,
        phoneNumber: String,
        relationship: String?
    ): Flow<Resource<EmergencyContact>> = flow {
        emit(Resource.Loading)
        try {
            val contact = EmergencyContact("1", name, phoneNumber, relationship)
            emit(Resource.Success(contact))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }

    override fun updateContact(
        contactId: String,
        name: String,
        phoneNumber: String,
        relationship: String?
    ): Flow<Resource<EmergencyContact>> = flow {
        emit(Resource.Loading)
        try {
            val contact = EmergencyContact(contactId, name, phoneNumber, relationship)
            emit(Resource.Success(contact))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }

    override fun deleteContact(contactId: String): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading)
        try {
            emit(Resource.Success(Unit))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }
}
