package com.appcoins.diceroll.sample.sdkbilling.feature.stats.data.repository

import com.appcoins.diceroll.sample.sdkbilling.core.db.DiceRollEntity
import com.appcoins.diceroll.sample.sdkbilling.feature.stats.data.model.DiceRoll

fun DiceRollEntity.mapToDiceRoll(): DiceRoll {
  return DiceRoll(
    id = this.id,
    rollWin = this.rollWin,
    guessNumber = this.guessNumber,
    resultNumber = this.resultNumber,
    attemptsLeft = this.attemptsLeft
  )
}

fun DiceRoll.mapToDiceRollEntity(): DiceRollEntity {
  return DiceRollEntity(
    id = this.id,
    rollWin = this.rollWin,
    guessNumber = this.guessNumber,
    resultNumber = this.resultNumber,
    attemptsLeft = this.attemptsLeft
  )
}

fun List<DiceRollEntity>.mapToDiceRollList(): List<DiceRoll> {
  return this.map { diceRollEntity ->
    DiceRoll(
      id = diceRollEntity.id,
      rollWin = diceRollEntity.rollWin,
      guessNumber = diceRollEntity.guessNumber,
      resultNumber = diceRollEntity.resultNumber,
      attemptsLeft = diceRollEntity.attemptsLeft
    )
  }
}


