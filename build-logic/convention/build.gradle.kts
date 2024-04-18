import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.tools.build.gradle)
    compileOnly(libs.kotlin.gradle.plugin)

}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "kr.kro.fatcats.nfctimer.convention.application"
            implementationClass = "kr.kro.fatcats.nfctimer.AndroidApplicationConventionPlugin"
        }

        register("androidLibrary") {
            id = "kr.kro.fatcats.nfctimer.convention.library"
            implementationClass = "kr.kro.fatcats.nfctimer.AndroidLibraryConventionPlugin"
        }

        register("hilt") {
            id = "kr.kro.fatcats.nfctimer.convention.hilt"
            implementationClass = "kr.kro.fatcats.nfctimer.AndroidHiltConventionPlugin"
        }

    }
}