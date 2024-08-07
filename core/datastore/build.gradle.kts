plugins {
  id("diceroll.android.library")
}

android {
  namespace = "com.appcoins.diceroll.sample.sdkbilling.core.datastore"
}

dependencies {
  implementation(libs.androidx.datastore.preferences)
}