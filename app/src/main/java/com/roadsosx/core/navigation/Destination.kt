package com.roadsosx.core.navigation

sealed class Destination(val route: String) {
    object Auth : Destination(Routes.AUTH)
    object Home : Destination(Routes.HOME)
    object SOS : Destination(Routes.SOS)
    object Contacts : Destination(Routes.CONTACTS)
    object Reports : Destination(Routes.REPORTS)
    object Maps : Destination(Routes.MAPS)
    object Profile : Destination(Routes.PROFILE)
    object Settings : Destination(Routes.SETTINGS)
}
