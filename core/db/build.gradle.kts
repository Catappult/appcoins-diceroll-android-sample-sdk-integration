import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.projectImplementation

plugins {
  id("diceroll.android.library")
  id("diceroll.room")
}

android {
  namespace = "com.appcoins.diceroll.sample.sdkbilling.core.db"
}

dependencies {
  projectImplementation(":core:utils")
}