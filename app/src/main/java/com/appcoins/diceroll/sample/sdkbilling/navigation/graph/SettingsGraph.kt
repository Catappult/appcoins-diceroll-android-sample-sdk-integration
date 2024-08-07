package com.appcoins.diceroll.sample.sdkbilling.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.appcoins.diceroll.sample.sdkbilling.feature.settings.ui.navigation.settingsRoute

internal fun NavGraphBuilder.settingsGraph(navController: NavHostController) {
  settingsRoute { navController.navigateUp() }
}