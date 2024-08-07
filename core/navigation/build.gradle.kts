import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.projectImplementation

plugins {
  id("diceroll.android.library.compose")
}

android {
  namespace = "com.appcoins.diceroll.sample.sdkbilling.core.navigation"
}

dependencies {
  projectImplementation(":core:utils")
  projectImplementation(":core:ui:design")
  implementation(libs.bundles.androidx.compose)
  implementation(libs.bundles.androidx.compose.accompanist)
}