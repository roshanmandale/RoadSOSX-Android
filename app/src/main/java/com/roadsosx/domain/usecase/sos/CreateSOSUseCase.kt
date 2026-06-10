package com.roadsosx.domain.usecase.sos

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.model.SOSEvent
import com.roadsosx.domain.repository.SOSRepository

class CreateSOSUseCase @Inject constructor(
    private val repository: SOSRepository
) {
    operator fun invoke(latitude: Double, longitude: Double, description: String?): Flow<Resource<SOSEvent>> {
        return repository.createSOSRequest(latitude, longitude, description)
    }
}
