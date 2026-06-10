package com.roadsosx.feature.maps.event

sealed interface MapsUiEvent {
    data class ServiceTypeSelected(val type: String) : MapsUiEvent
    object RefreshLocation : MapsUiEvent
}
