package com.roadsosx.domain.repository

import kotlinx.coroutines.flow.Flow
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.model.AccidentReport

interface ReportsRepository {
    fun submitAccidentReport(
        description: String,
        imageBytes: ByteArray?,
        latitude: Double,
        longitude: Double
    ): Flow<Resource<AccidentReport>>
    
    fun getMyAccidentReports(): Flow<Resource<List<AccidentReport>>>
}
