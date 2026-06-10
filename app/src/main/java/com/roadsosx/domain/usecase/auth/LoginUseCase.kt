package com.roadsosx.domain.usecase.auth

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.model.User
import com.roadsosx.domain.repository.AuthRepository

class LoginUseCase @Inject constructor(
    private val repository: AuthRepository
) {
    operator fun invoke(email: String, password: String): Flow<Resource<User>> {
        return repository.login(email, password)
    }
}
