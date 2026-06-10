package com.roadsosx.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import com.roadsosx.core.common.Resource
import com.roadsosx.core.security.SessionManager
import com.roadsosx.data.local.dao.UserDao
import com.roadsosx.data.datasource.AuthRemoteDataSource
import com.roadsosx.domain.model.User
import com.roadsosx.domain.repository.AuthRepository

class AuthRepositoryImpl @Inject constructor(
    private val authRemoteDataSource: AuthRemoteDataSource,
    private val userDao: UserDao,
    private val sessionManager: SessionManager
) : AuthRepository {

    override fun login(email: String, password: String): Flow<Resource<User>> = flow {
        emit(Resource.Loading)
        try {
            val token = authRemoteDataSource.loginWithEmail(email, password)
            sessionManager.saveSession(token, email)
            val user = User("1", "User Name", email, "1234567890", null)
            emit(Resource.Success(user))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }

    override fun register(name: String, email: String, password: String): Flow<Resource<User>> = flow {
        emit(Resource.Loading)
        try {
            val userId = authRemoteDataSource.registerWithEmail(name, email, password)
            val user = User(userId, name, email, "", null)
            emit(Resource.Success(user))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }

    override fun logout(): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading)
        try {
            authRemoteDataSource.logout()
            sessionManager.clearSession()
            userDao.clearUser()
            emit(Resource.Success(Unit))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }

    override fun getCurrentUser(): Flow<Resource<User?>> = flow {
        emit(Resource.Loading)
        try {
            if (sessionManager.isLoggedIn()) {
                val email = sessionManager.getUserEmail() ?: ""
                val user = User("1", "Cached User", email, "1234567890", null)
                emit(Resource.Success(user))
            } else {
                emit(Resource.Success(null))
            }
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }
}
