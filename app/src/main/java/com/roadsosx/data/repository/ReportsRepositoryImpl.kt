package com.roadsosx.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.model.AccidentReport
import com.roadsosx.domain.repository.ReportsRepository

class ReportsRepositoryImpl @Inject constructor() : ReportsRepository {

    override fun submitAccidentReport(
        description: String,
        imageBytes: ByteArray?,
        latitude: Double,
        longitude: Double
    ): Flow<Resource<AccidentReport>> = flow {
        emit(Resource.Loading)
        try {
            val report = AccidentReport(
                id = "1",
                description = description,
                imageUrls = emptyList(),
                latitude = latitude,
                longitude = longitude,
                timestamp = System.currentTimeMillis()
            )
            emit(Resource.Success(report))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }

    override fun getMyAccidentReports(): Flow<Resource<List<AccidentReport>>> = flow {
        emit(Resource.Loading)
        try {
            emit(Resource.Success(emptyList()))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }
}
