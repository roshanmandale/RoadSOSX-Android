package com.roadsosx.core.location

import android.app.Application
import android.content.Context
import android.location.Location
import com.google.android.gms.location.FusedLocationProviderClient
import javax.inject.Inject

class DefaultLocationTracker @Inject constructor(
    private val locationClient: FusedLocationProviderClient,
    private val application: Application
) : LocationTracker {
    
    override suspend fun getCurrentLocation(): Location? {
        // Placeholder stub to be implemented later with location permissions verification
        return null
    }
}
