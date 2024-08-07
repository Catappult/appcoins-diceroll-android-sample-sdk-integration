import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.projectImplementation

plugins {
  id("diceroll.android.feature.data")
}

android {
  namespace = "com.appcoins.diceroll.sample.sdkbilling.feature.stats.data"
}

dependencies {
  projectImplementation(":core:utils")
  projectImplementation(":core:db")
  implementation(libs.androidx.datastore.preferences)
}