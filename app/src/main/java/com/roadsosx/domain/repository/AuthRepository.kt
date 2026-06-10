package com.roadsosx.domain.repository

import kotlinx.coroutines.flow.Flow
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.model.User

interface AuthRepository {
    fun login(email: String, password: String): Flow<Resource<User>>
    fun register(name: String, email: String, password: String): Flow<Resource<User>>
    fun logout(): Flow<Resource<Unit>>
    fun getCurrentUser(): Flow<Resource<User?>>
}
