package com.roadsosx.feature.maps.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.roadsosx.feature.maps.viewmodel.MapsViewModel

@Composable
fun MapsScreen(
    viewModel: MapsViewModel,
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Google Maps & Services Screen (RoadSOSX)")
    }
}
