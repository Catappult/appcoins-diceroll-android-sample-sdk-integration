package com.appcoins.diceroll.sample.sdkbilling.payments.sdk

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * Manages the SDK integration for billing.
 *
 * This class initializes the billing client, sets up
 * listeners for billing events, and provides methods to interact
 * with the billing service.
 *
 * It serves as a wrapper around the SDK to handle all the
 * necessary setup and provide callbacks to the app for billing events
 * in order to simplify the call for it.
 *
 */
object SdkManagerImpl : SdkManager {

    override val _connectionState: MutableStateFlow<Boolean> = MutableStateFlow(true)

    override val _attemptsPrice: MutableStateFlow<String?> = MutableStateFlow(null)

    val connectionState: StateFlow<Boolean> = _connectionState

    val attemptsPrice: StateFlow<String?> = _attemptsPrice

    // TODO: Use this KEY to initialize the Billing if necessary
    private const val SDK_BILLING_PUBLIC_KEY = BuildConfig.SDK_BILLING_PUBLIC_KEY


    fun setupSdkConnection() {
        // TODO: Setup here the connection to the SDK
    }
}