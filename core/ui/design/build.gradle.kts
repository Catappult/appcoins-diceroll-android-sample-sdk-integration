plugins {
  id("diceroll.android.library.compose")
}

android {
  namespace = "com.appcoins.diceroll.sample.sdkbilling.core.ui.design"
}

dependencies {
  implementation(libs.bundles.androidx.compose)
  implementation(libs.androidx.compose.material.iconsExtended)
}