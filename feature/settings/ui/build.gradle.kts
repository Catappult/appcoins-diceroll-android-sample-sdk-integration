import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.projectImplementation

plugins {
  id("diceroll.android.feature.ui")
}

android {
  namespace = "com.appcoins.diceroll.sample.sdkbilling.feature.settings.ui"
}

dependencies {
  projectImplementation(":payments:sdk")
  projectImplementation(":feature:settings:data")
  projectImplementation(":core:ui:design")
  projectImplementation(":core:ui:widgets")
  projectImplementation(":core:utils")
  projectImplementation(":core:navigation")
}