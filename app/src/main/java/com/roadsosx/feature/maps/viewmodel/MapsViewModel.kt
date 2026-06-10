package com.roadsosx.feature.maps.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.roadsosx.domain.repository.MapsRepository
import com.roadsosx.feature.maps.state.MapsUiState

@HiltViewModel
class MapsViewModel @Inject constructor(
    private val mapsRepository: MapsRepository
) : ViewModel() {

    private val _state = MutableStateFlow(MapsUiState())
    val state: StateFlow<MapsUiState> = _state.asStateFlow()

    fun searchNearbyServices(latitude: Double, longitude: Double, serviceType: String) {
        viewModelScope.launch {
            // Trigger mapsRepository.getNearbyServices(...)
        }
    }
}
