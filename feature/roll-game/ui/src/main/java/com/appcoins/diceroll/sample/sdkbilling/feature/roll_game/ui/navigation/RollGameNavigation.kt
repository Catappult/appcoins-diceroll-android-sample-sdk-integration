package com.appcoins.diceroll.sample.sdkbilling.feature.roll_game.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import com.appcoins.diceroll.sample.sdkbilling.core.navigation.destinations.Destinations
import com.appcoins.diceroll.sample.sdkbilling.core.navigation.buildDestinationRoute
import com.appcoins.diceroll.sample.sdkbilling.core.navigation.navigateToDestination
import com.appcoins.diceroll.sample.sdkbilling.feature.payments.ui.Item
import com.appcoins.diceroll.sample.sdkbilling.feature.roll_game.ui.RollGameRoute

fun NavController.navigateToRollGame(navOptions: NavOptions) {
  this.navigateToDestination(
    destination = Destinations.Screen.RollGame,
    navOptions = navOptions
  )
}

fun NavGraphBuilder.rollGameRoute(onBuyClick: (Item) -> Unit) {
  this.buildDestinationRoute(
    destination = Destinations.Screen.RollGame,
  ) {
    RollGameRoute(onBuyClick)
  }
}
