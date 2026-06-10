package com.roadsosx.feature.maps.navigation

import androidx.navigation.NavController

const val MAPS_ROUTE = "maps"

fun NavController.navigateToMaps() {
    navigate(MAPS_ROUTE)
}
