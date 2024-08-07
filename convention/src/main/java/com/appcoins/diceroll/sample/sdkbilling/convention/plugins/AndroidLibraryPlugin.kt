package com.appcoins.diceroll.sample.sdkbilling.convention.plugins

import com.android.build.gradle.LibraryExtension
import com.appcoins.diceroll.sample.sdkbilling.convention.Config
import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.configureAndroidAndKotlin
import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.implementation
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidLibraryPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    with(target) {
      with(pluginManager) {
        apply("com.android.library")
        apply("kotlin-android")
        apply<HiltPlugin>()
      }

      extensions.configure<LibraryExtension> {
        configureAndroidAndKotlin(this)
        defaultConfig.targetSdk = Config.android.targetSdk
      }

      dependencies {
        implementation("kotlin.stdlib")
      }
    }
  }
}