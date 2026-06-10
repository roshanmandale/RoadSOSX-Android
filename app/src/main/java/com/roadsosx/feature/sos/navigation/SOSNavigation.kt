package com.roadsosx.feature.sos.navigation

import androidx.navigation.NavController

const val SOS_ROUTE = "sos"

fun NavController.navigateToSOS() {
    navigate(SOS_ROUTE)
}
