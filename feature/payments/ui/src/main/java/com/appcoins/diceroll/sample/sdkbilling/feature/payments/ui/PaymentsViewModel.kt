package com.appcoins.diceroll.sample.sdkbilling.feature.payments.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.appcoins.diceroll.sample.sdkbilling.core.navigation.destinations.DestinationArgs
import com.appcoins.diceroll.sample.sdkbilling.feature.payments.ui.result.PaymentsResultUiState
import com.appcoins.diceroll.sample.sdkbilling.feature.roll_game.data.DEFAULT_ATTEMPTS_NUMBER
import com.appcoins.diceroll.sample.sdkbilling.feature.roll_game.data.usecases.ResetAttemptsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class PaymentsViewModel @Inject constructor(
  private val resetAttemptsUseCase: ResetAttemptsUseCase,
  val savedStateHandle: SavedStateHandle,
) : ViewModel() {

  private val itemId = savedStateHandle.get<String>(DestinationArgs.ITEM_ID)
  private val attempts = savedStateHandle.get<String>(DestinationArgs.ATTEMPTS_LEFT)

  private val _paymentProcessState =
    MutableStateFlow<PaymentProcessUiState>(PaymentProcessUiState.Loading)
  internal val paymentProcessState: StateFlow<PaymentProcessUiState> get() = _paymentProcessState

  private val _paymentResultState =
    MutableStateFlow<PaymentsResultUiState>(PaymentsResultUiState.Initialized)
  internal val paymentResultState: StateFlow<PaymentsResultUiState> get() = _paymentResultState

  init {
    when {
      itemId == null || attempts == null -> {
        _paymentProcessState.value = PaymentProcessUiState.Error
      }

      attempts == DEFAULT_ATTEMPTS_NUMBER.toString() -> {
        _paymentProcessState.value = PaymentProcessUiState.NotAvailable
      }

      else -> {
        _paymentProcessState.value = PaymentProcessUiState.StartPayment
      }
    }
  }

  suspend fun resetAttemptsLeft() {
    resetAttemptsUseCase()
  }

  fun launchBillingSdkFlow() {
    _paymentProcessState.value = PaymentProcessUiState.PaymentInProgress
    _paymentResultState.value = PaymentsResultUiState.Loading
    /**
     * TODO Start here the payment and add the necessary observables to update the UI accordingly
     * Update the following property when the Purchase result is receive:
     * @property _paymentResultState
     */
  }
}
