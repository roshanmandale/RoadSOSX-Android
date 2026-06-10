package com.roadsosx.domain.repository

import kotlinx.coroutines.flow.Flow
import com.roadsosx.core.common.Resource
import android.location.Location

interface MapsRepository {
    fun getNearbyServices(latitude: Double, longitude: Double, type: String): Flow<Resource<List<String>>>
    fun getRouteAssistance(start: Location, destination: Location): Flow<Resource<String>>
}
