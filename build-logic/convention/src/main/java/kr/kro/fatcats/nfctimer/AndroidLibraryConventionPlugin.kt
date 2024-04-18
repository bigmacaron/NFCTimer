package kr.kro.fatcats.nfctimer

import com.android.build.api.dsl.LibraryExtension
import kr.kro.fatcats.nfctimer.convention.configureAppDefault
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
                apply("lgt.call.convention.library")
            }

            extensions.configure<LibraryExtension> {
                configureAppDefault(this)
            }
        }
    }
}