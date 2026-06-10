package com.roadsosx.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import com.roadsosx.core.common.Resource
import com.roadsosx.data.local.dao.SOSEventDao
import com.roadsosx.data.datasource.SOSRemoteDataSource
import com.roadsosx.domain.model.SOSEvent
import com.roadsosx.domain.repository.SOSRepository

class SOSRepositoryImpl @Inject constructor(
    private val sosRemoteDataSource: SOSRemoteDataSource,
    private val sosEventDao: SOSEventDao
) : SOSRepository {

    override fun createSOSRequest(
        latitude: Double,
        longitude: Double,
        description: String?
    ): Flow<Resource<SOSEvent>> = flow {
        emit(Resource.Loading)
        try {
            val sosId = sosRemoteDataSource.createSOSRequest(latitude, longitude, description)
            val event = SOSEvent(sosId, System.currentTimeMillis(), latitude, longitude, "ACTIVE", description)
            emit(Resource.Success(event))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }

    override fun getActiveSOSRequests(): Flow<Resource<List<SOSEvent>>> = flow {
        emit(Resource.Loading)
        try {
            emit(Resource.Success(emptyList()))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }

    override fun resolveSOSEvent(eventId: String): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading)
        try {
            emit(Resource.Success(Unit))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }
}
