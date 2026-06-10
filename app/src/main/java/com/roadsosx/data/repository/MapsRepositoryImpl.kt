package com.roadsosx.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.repository.MapsRepository
import android.location.Location

class MapsRepositoryImpl @Inject constructor() : MapsRepository {

    override fun getNearbyServices(
        latitude: Double,
        longitude: Double,
        type: String
    ): Flow<Resource<List<String>>> = flow {
        emit(Resource.Loading)
        try {
            emit(Resource.Success(emptyList()))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }

    override fun getRouteAssistance(start: Location, destination: Location): Flow<Resource<String>> = flow {
        emit(Resource.Loading)
        try {
            emit(Resource.Success("fake-polyline-path"))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }
}
