import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.projectImplementation

plugins {
  id("diceroll.android.feature.ui")
}

android {
  namespace = "com.appcoins.diceroll.sample.sdkbilling.feature.payments.ui"
}

dependencies {
  compileOnly(fileTree(mapOf("dir" to "libs", "include" to "*.aar")))
  projectImplementation(":feature:roll-game:data")
  projectImplementation(":payments:sdk")
  projectImplementation(":core:ui:design")
  projectImplementation(":core:ui:widgets")
  projectImplementation(":core:utils")
  projectImplementation(":core:navigation")
  implementation(libs.bundles.coil)
}