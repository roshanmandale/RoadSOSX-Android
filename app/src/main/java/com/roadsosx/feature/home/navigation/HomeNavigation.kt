package com.roadsosx.feature.home.navigation

import androidx.navigation.NavController

const val HOME_ROUTE = "home"

fun NavController.navigateToHome() {
    navigate(HOME_ROUTE) {
        popUpTo(0) { inclusive = true }
    }
}
