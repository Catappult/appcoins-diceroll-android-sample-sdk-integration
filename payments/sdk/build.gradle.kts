import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.projectImplementation

plugins {
  id("diceroll.android.library")
}

android {
  namespace = "com.appcoins.diceroll.sample.sdkbilling.payments.sdk"
  buildTypes {
    debug {
      buildConfigField(
        "String",
        "SDK_BILLING_PUBLIC_KEY",
        project.property("DICEROLL_SDK_BILLING_PUBLIC_KEY_DEV").toString()
      )

    }
    release {
      buildConfigField(
        "String",
        "SDK_BILLING_PUBLIC_KEY",
        project.property("DICEROLL_SDK_BILLING_PUBLIC_KEY").toString()
      )
    }
  }
  buildFeatures {
    buildConfig = true
  }
}

dependencies {
  projectImplementation(":core:utils")
}