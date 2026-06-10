package com.roadsosx.feature.reports.navigation

import androidx.navigation.NavController

const val REPORTS_ROUTE = "reports"

fun NavController.navigateToReports() {
    navigate(REPORTS_ROUTE)
}
