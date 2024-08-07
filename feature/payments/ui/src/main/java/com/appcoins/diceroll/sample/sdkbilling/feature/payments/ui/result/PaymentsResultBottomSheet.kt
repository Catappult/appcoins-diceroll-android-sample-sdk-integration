package com.appcoins.diceroll.sample.sdkbilling.feature.payments.ui.result

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.appcoins.diceroll.sample.sdkbilling.core.ui.design.R
import com.appcoins.diceroll.sample.sdkbilling.core.ui.design.theme.DiceRollTheme
import com.appcoins.diceroll.sample.sdkbilling.core.ui.widgets.ErrorAnimation
import com.appcoins.diceroll.sample.sdkbilling.core.ui.widgets.LoadingAnimation
import com.appcoins.diceroll.sample.sdkbilling.core.ui.widgets.SuccessAnimation

@Composable
fun PaymentsResult(
  uiState: PaymentsResultUiState,
  onPaymentSuccess: suspend () -> Unit,
) {
  when (uiState) {
    is PaymentsResultUiState.Initialized -> {}
    is PaymentsResultUiState.Loading -> LoadingAnimation(bodyMessage = stringResource(id = R.string.payments_loading))
    is PaymentsResultUiState.UserCanceled -> ErrorAnimation(
      titleMessage = stringResource(R.string.payments_user_canceled_title),
      bodyMessage = stringResource(R.string.payments_user_canceled_body)
    )

    is PaymentsResultUiState.Failed -> ErrorAnimation(
      titleMessage = stringResource(R.string.payments_failed_title),
      bodyMessage = stringResource(R.string.payments_failed_body)
    )

    is PaymentsResultUiState.Success -> SuccessContent(onPaymentSuccess)
  }
}

@Composable
fun SuccessContent(onPaymentSuccess: suspend () -> Unit) {
  LaunchedEffect(rememberCoroutineScope()) {
    onPaymentSuccess()
  }
  SuccessAnimation(
    titleMessage = stringResource(R.string.payments_success_title),
    bodyMessage = stringResource(R.string.payments_success_body)
  )
}
