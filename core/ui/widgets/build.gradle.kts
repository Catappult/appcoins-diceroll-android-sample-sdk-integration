import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.projectImplementation

plugins {
  id("diceroll.android.library.compose")
}

android {
  namespace = "com.appcoins.diceroll.sample.sdkbilling.core.ui.widgets"

  buildFeatures {
    buildConfig = true
  }

  defaultConfig {
    buildConfigField(
      "String",
      "SDK_BILLING_LIBRARY_VERSION",
      // TODO Add here the path to the version of the SDK implementing
      // "\"${libs.my.billing.sdk.get().version}\""
      "\"example\""
    )
  }
}

dependencies {
  projectImplementation(":core:ui:design")
  implementation(libs.bundles.androidx.compose)
  implementation(libs.lottie)
}