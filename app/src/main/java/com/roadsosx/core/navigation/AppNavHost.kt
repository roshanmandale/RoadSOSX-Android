package com.roadsosx.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.roadsosx.feature.auth.screen.AuthScreen
import com.roadsosx.feature.auth.viewmodel.AuthViewModel
import com.roadsosx.feature.contacts.screen.ContactsScreen
import com.roadsosx.feature.contacts.viewmodel.ContactsViewModel
import com.roadsosx.feature.home.screen.HomeScreen
import com.roadsosx.feature.home.viewmodel.HomeViewModel
import com.roadsosx.feature.maps.screen.MapsScreen
import com.roadsosx.feature.maps.viewmodel.MapsViewModel
import com.roadsosx.feature.profile.screen.ProfileScreen
import com.roadsosx.feature.profile.viewmodel.ProfileViewModel
import com.roadsosx.feature.reports.screen.ReportsScreen
import com.roadsosx.feature.reports.viewmodel.ReportsViewModel
import com.roadsosx.feature.settings.screen.SettingsScreen
import com.roadsosx.feature.settings.viewmodel.SettingsViewModel
import com.roadsosx.feature.sos.screen.SOSScreen
import com.roadsosx.feature.sos.viewmodel.SOSViewModel

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Destination.Auth.route,
        modifier = modifier
    ) {
        composable(Destination.Auth.route) {
            val viewModel: AuthViewModel = hiltViewModel()
            AuthScreen(
                viewModel = viewModel,
                onNavigateToHome = {
                    navController.navigate(Destination.Home.route) {
                        popUpTo(Destination.Auth.route) { inclusive = true }
                    }
                }
            )
        }
        composable(Destination.Home.route) {
            val viewModel: HomeViewModel = hiltViewModel()
            HomeScreen(
                viewModel = viewModel,
                onNavigateToSOS = { navController.navigate(Destination.SOS.route) },
                onNavigateToContacts = { navController.navigate(Destination.Contacts.route) },
                onNavigateToReports = { navController.navigate(Destination.Reports.route) },
                onNavigateToMaps = { navController.navigate(Destination.Maps.route) },
                onNavigateToProfile = { navController.navigate(Destination.Profile.route) },
                onNavigateToSettings = { navController.navigate(Destination.Settings.route) }
            )
        }
        composable(Destination.SOS.route) {
            val viewModel: SOSViewModel = hiltViewModel()
            SOSScreen(
                viewModel = viewModel,
                onNavigateBack = { navController.popBackStack() }
            )
        }
        composable(Destination.Contacts.route) {
            val viewModel: ContactsViewModel = hiltViewModel()
            ContactsScreen(
                viewModel = viewModel,
                onNavigateBack = { navController.popBackStack() }
            )
        }
        composable(Destination.Reports.route) {
            val viewModel: ReportsViewModel = hiltViewModel()
            ReportsScreen(
                viewModel = viewModel,
                onNavigateBack = { navController.popBackStack() }
            )
        }
        composable(Destination.Maps.route) {
            val viewModel: MapsViewModel = hiltViewModel()
            MapsScreen(
                viewModel = viewModel,
                onNavigateBack = { navController.popBackStack() }
            )
        }
        composable(Destination.Profile.route) {
            val viewModel: ProfileViewModel = hiltViewModel()
            ProfileScreen(
                viewModel = viewModel,
                onNavigateBack = { navController.popBackStack() }
            )
        }
        composable(Destination.Settings.route) {
            val viewModel: SettingsViewModel = hiltViewModel()
            SettingsScreen(
                viewModel = viewModel,
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}
