package com.appcoins.diceroll.sample.sdkbilling.convention.plugins

import com.android.build.gradle.LibraryExtension
import com.appcoins.diceroll.sample.sdkbilling.convention.extensions.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

class AndroidLibraryComposePlugin : Plugin<Project> {
  override fun apply(target: Project) {
    with(target) {
      apply<AndroidLibraryPlugin>()
      extensions.configure<LibraryExtension> {
        configureAndroidCompose(this)
      }
    }
  }
}