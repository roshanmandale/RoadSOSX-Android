package com.roadsosx.feature.profile.navigation

import androidx.navigation.NavController

const val PROFILE_ROUTE = "profile"

fun NavController.navigateToProfile() {
    navigate(PROFILE_ROUTE)
}
