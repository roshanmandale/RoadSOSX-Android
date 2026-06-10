package com.roadsosx.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.model.User
import com.roadsosx.domain.repository.ProfileRepository

class ProfileRepositoryImpl @Inject constructor() : ProfileRepository {

    override fun updateProfile(name: String, phoneNumber: String): Flow<Resource<User>> = flow {
        emit(Resource.Loading)
        try {
            val user = User("1", name, "user@example.com", phoneNumber, null)
            emit(Resource.Success(user))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }

    override fun uploadProfilePicture(imageBytes: ByteArray): Flow<Resource<String>> = flow {
        emit(Resource.Loading)
        try {
            emit(Resource.Success("https://supabase.storage.example.com/profiles/avatar.png"))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }
}
