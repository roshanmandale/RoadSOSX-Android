package com.roadsosx.feature.settings.navigation

import androidx.navigation.NavController

const val SETTINGS_ROUTE = "settings"

fun NavController.navigateToSettings() {
    navigate(SETTINGS_ROUTE)
}
