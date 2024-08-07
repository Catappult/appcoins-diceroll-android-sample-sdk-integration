package com.appcoins.diceroll.sample.sdkbilling.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.appcoins.diceroll.sample.sdkbilling.feature.payments.ui.Item
import com.appcoins.diceroll.sample.sdkbilling.feature.payments.ui.navigation.navigateToPaymentResultBottomSheet
import com.appcoins.diceroll.sample.sdkbilling.feature.payments.ui.navigation.paymentProcessRoute
import com.appcoins.diceroll.sample.sdkbilling.feature.payments.ui.toSku
import com.appcoins.diceroll.sample.sdkbilling.feature.roll_game.ui.navigation.rollGameRoute

internal fun NavGraphBuilder.rollGameGraph(navController: NavHostController) {
    rollGameRoute(onBuyClick = { item ->
        navController.navigateToPaymentResultBottomSheet(
            item.toSku(),
            if (item is Item.Attempts) {
                item.currentAttempts.toString()
            } else {
                "0"
            }
        )
    })
    paymentProcessRoute(onDismiss = {
        navController.navigateUp()
    })
}