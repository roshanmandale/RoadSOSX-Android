package com.roadsosx.domain.repository

import kotlinx.coroutines.flow.Flow
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.model.User

interface ProfileRepository {
    fun updateProfile(name: String, phoneNumber: String): Flow<Resource<User>>
    fun uploadProfilePicture(imageBytes: ByteArray): Flow<Resource<String>>
}
