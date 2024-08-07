package com.appcoins.diceroll.sample.sdkbilling.payments.sdk

import android.content.Context
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Manages the SDK integration the billing system.
 *
 * This class initializes the billing client, sets up
 * listeners for billing events, and provides methods to interact
 * with the billing service.
 *
 * It serves as a wrapper around the SDK to handle all the
 * necessary setup and provide callbacks to the app for billing events
 * in order to simplify the call for it.
 *
 * It contains also the Mutable values for the:
 * @property _connectionState State of the connection to the SDKs Billing Service which will trigger
 * the setup state of the Billing and it's readiness.
 * @property _attemptsPrice Price of the Attempts SKU. To be updated by the price received from
 * the Billing Client.
 */
interface SdkManager {

    val _connectionState: MutableStateFlow<Boolean>

    val _attemptsPrice: MutableStateFlow<String?>

    /**
     * Starts the payment flow for the given SKU.
     *
     * @param sku The SKU identifier for the in-app product.
     *
     * This will launch the billing flow of the SDK.
     */
    fun startPayment(context: Context, sku: String) {
        // TODO Start here the payment for the selected SKU
    }
}
