package com.roadsosx.feature.sos.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.roadsosx.feature.sos.viewmodel.SOSViewModel

@Composable
fun SOSScreen(
    viewModel: SOSViewModel,
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "SOS Incident Screen (RoadSOSX)")
    }
}
