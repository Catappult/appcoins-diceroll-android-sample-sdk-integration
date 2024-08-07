package com.appcoins.diceroll.sample.sdkbilling.feature.roll_game.data.usecases

import com.appcoins.diceroll.sample.sdkbilling.feature.roll_game.data.AttemptsDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAttemptsUseCase @Inject constructor(private val datastore: AttemptsDataSource) {

  operator fun invoke(): Flow<Int> = datastore.getAttemptsLeft()
}