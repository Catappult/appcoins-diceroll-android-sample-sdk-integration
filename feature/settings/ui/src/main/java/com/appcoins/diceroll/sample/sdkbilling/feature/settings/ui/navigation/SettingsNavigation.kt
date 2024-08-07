package com.appcoins.diceroll.sample.sdkbilling.feature.settings.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.appcoins.diceroll.sample.sdkbilling.core.navigation.buildDestinationRoute
import com.appcoins.diceroll.sample.sdkbilling.core.navigation.destinations.Destinations
import com.appcoins.diceroll.sample.sdkbilling.core.navigation.navigateToDestination
import com.appcoins.diceroll.sample.sdkbilling.feature.settings.ui.SettingsRoute

fun NavController.navigateToSettings() {
  this.navigateToDestination(
    destination = Destinations.Dialog.Settings
  )
}

fun NavGraphBuilder.settingsRoute(onDismiss: () -> Unit) {
  this.buildDestinationRoute(
    destination = Destinations.Dialog.Settings,
  ) {
    SettingsRoute(onDismiss)
  }
}
