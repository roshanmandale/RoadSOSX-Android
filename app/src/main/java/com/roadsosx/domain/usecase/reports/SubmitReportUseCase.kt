package com.roadsosx.domain.usecase.reports

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.model.AccidentReport
import com.roadsosx.domain.repository.ReportsRepository

class SubmitReportUseCase @Inject constructor(
    private val repository: ReportsRepository
) {
    operator fun invoke(
        description: String,
        imageBytes: ByteArray?,
        latitude: Double,
        longitude: Double
    ): Flow<Resource<AccidentReport>> {
        return repository.submitAccidentReport(description, imageBytes, latitude, longitude)
    }
}
