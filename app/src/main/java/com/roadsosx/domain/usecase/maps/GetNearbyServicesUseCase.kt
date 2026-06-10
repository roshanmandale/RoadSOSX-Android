package com.roadsosx.domain.usecase.maps

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.repository.MapsRepository

class GetNearbyServicesUseCase @Inject constructor(
    private val repository: MapsRepository
) {
    operator fun invoke(latitude: Double, longitude: Double, serviceType: String): Flow<Resource<List<String>>> {
        return repository.getNearbyServices(latitude, longitude, serviceType)
    }
}
