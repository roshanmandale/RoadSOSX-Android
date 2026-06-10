package com.roadsosx.core.navigation

sealed class BottomNavItem(
    val route: String,
    val title: String
) {
    object Home : BottomNavItem(Routes.HOME, "Home")
    object Contacts : BottomNavItem(Routes.CONTACTS, "Contacts")
    object Maps : BottomNavItem(Routes.MAPS, "Maps")
    object Profile : BottomNavItem(Routes.PROFILE, "Profile")
}
