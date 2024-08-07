import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.projectImplementation

plugins {
  id("diceroll.android.feature.data")
}

android {
  namespace = "com.appcoins.diceroll.sample.sdkbilling.feature.roll_game.data"
}

dependencies {
  projectImplementation(":core:utils")
  projectImplementation(":core:datastore")
  implementation(libs.androidx.datastore.preferences)
}