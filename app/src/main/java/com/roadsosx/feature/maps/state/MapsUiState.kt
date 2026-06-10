package com.roadsosx.feature.maps.state

import android.location.Location

data class MapsUiState(
    val isLoading: Boolean = false,
    val currentLocation: Location? = null,
    val nearbyServices: List<String> = emptyList(),
    val error: String? = null
)
