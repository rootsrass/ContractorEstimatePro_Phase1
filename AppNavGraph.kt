package com.contractor.estimatepro.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.contractor.estimatepro.ui.screens.*

object Routes {
    const val SPLASH = "splash"
    const val HOME = "home"
    const val NEW = "new"
    const val SUMMARY = "summary"
    const val SAVED = "saved"
}

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Routes.SPLASH) {
        composable(Routes.SPLASH) { SplashScreen(navController) }
        composable(Routes.HOME) { HomeScreen(navController) }
        composable(Routes.NEW) { NewEstimateScreen(navController) }
        composable(Routes.SUMMARY) { SummaryScreen(navController) }
        composable(Routes.SAVED) { SavedEstimatesScreen(navController) }
    }
}