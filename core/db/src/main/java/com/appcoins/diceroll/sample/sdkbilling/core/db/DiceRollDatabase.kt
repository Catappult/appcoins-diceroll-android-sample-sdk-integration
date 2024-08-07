package com.appcoins.diceroll.sample.sdkbilling.core.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
  entities = [DiceRollEntity::class],
  version = 1
)
abstract class DiceRollDatabase : RoomDatabase() {
  abstract fun diceRollDao(): DiceRollDao
}