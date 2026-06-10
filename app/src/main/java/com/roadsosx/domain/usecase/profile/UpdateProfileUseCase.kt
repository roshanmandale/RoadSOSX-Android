package com.roadsosx.domain.usecase.profile

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.model.User
import com.roadsosx.domain.repository.ProfileRepository

class UpdateProfileUseCase @Inject constructor(
    private val repository: ProfileRepository
) {
    operator fun invoke(name: String, phoneNumber: String): Flow<Resource<User>> {
        return repository.updateProfile(name, phoneNumber)
    }
}
