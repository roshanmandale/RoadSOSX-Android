package com.roadsosx.feature.auth.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder

const val AUTH_ROUTE = "auth"

fun NavController.navigateToAuth() {
    navigate(AUTH_ROUTE) {
        popUpTo(0) { inclusive = true }
    }
}
