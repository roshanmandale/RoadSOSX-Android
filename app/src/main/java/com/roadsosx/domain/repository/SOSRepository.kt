package com.roadsosx.domain.repository

import kotlinx.coroutines.flow.Flow
import com.roadsosx.core.common.Resource
import com.roadsosx.domain.model.SOSEvent

interface SOSRepository {
    fun createSOSRequest(latitude: Double, longitude: Double, description: String?): Flow<Resource<SOSEvent>>
    fun getActiveSOSRequests(): Flow<Resource<List<SOSEvent>>>
    fun resolveSOSEvent(eventId: String): Flow<Resource<Unit>>
}
