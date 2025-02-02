package com.appcoins.diceroll.sample.sdkbilling.feature.stats.data.usecases

import com.appcoins.diceroll.sample.sdkbilling.feature.stats.data.model.DiceRoll
import com.appcoins.diceroll.sample.sdkbilling.feature.stats.data.repository.DiceRollRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetDiceRollsUseCase @Inject constructor(private val diceRollRepository: DiceRollRepository) {

  operator fun invoke(): Flow<List<DiceRoll>> = diceRollRepository.getBdDiceRolls()
}