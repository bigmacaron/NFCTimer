package kr.kro.fatcats.nfctimer

import com.android.build.api.dsl.ApplicationExtension
import kr.kro.fatcats.nfctimer.convention.configureAppDefault
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
                apply("kotlin-parcelize")
            }
            extensions.configure<ApplicationExtension> {
                configureAppDefault(this)
            }
        }
    }
}