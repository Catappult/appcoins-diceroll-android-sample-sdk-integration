package com.appcoins.diceroll.sample.sdkbilling.feature.payments.ui

/**
 * Payment item in game to represent and match a given SKU.
 */
sealed class Item  {
  data class Attempts(val currentAttempts: Int) : Item()
}

/**
 * Map a [Item] to a SKU string.
 */
fun Item.toSku(): String = when (this) {
  is Item.Attempts -> "attempts"
}
