pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "NFCTimer"
include(":app")

// If the project has build-logic module with convention module. (for example: https://github.com/android/nowinandroid/tree/main/build-logic)
// https://stackoverflow.com/questions/77279080/unable-to-make-progress-running-work-android-studio
gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:convention:testClasses"))

