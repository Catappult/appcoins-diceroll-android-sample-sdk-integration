import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.projectImplementation

plugins {
  id("diceroll.android.app")
}

android {
  namespace = "com.appcoins.diceroll.sample.sdkbilling"
  defaultConfig {
    applicationId = "com.appcoins.diceroll.sample.sdkbilling"
    versionCode = 1
    versionName = "0.1.0"
    multiDexEnabled = true
  }
}

dependencies {
  projectImplementation(":core:ui:design")
  projectImplementation(":core:ui:widgets")
  projectImplementation(":core:utils")
  projectImplementation(":core:navigation")
  projectImplementation(":feature:settings:data")
  projectImplementation(":feature:settings:ui")
  projectImplementation(":feature:stats:ui")
  projectImplementation(":feature:roll-game:ui")
  projectImplementation(":feature:payments:ui")
  projectImplementation(":payments:sdk")
  implementation(libs.androidx.splashscreen)
  implementation(libs.bundles.androidx.compose)
  implementation(libs.bundles.androidx.compose.accompanist)
}