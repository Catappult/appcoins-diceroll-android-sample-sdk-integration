import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.projectImplementation

plugins {
  id("diceroll.android.feature.ui")
}

android {
  namespace = "com.appcoins.diceroll.sample.sdkbilling.feature.stats.ui"
}

dependencies {
  projectImplementation(":feature:settings:data")
  projectImplementation(":feature:stats:data")
  projectImplementation(":core:ui:design")
  projectImplementation(":core:ui:widgets")
  projectImplementation(":core:utils")
  projectImplementation(":core:navigation")
  implementation(libs.charts.tehras)
}