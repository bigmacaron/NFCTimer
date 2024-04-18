plugins {
    alias(libs.plugins.get.application)
    alias(libs.plugins.get.hilt)
}

android {
    namespace = "kr.kro.fatcats.nfctimer"

    defaultConfig {
        applicationId =  "kr.kro.fatcats.nfctimer"
        targetSdk = 34
        versionCode = 10000
        versionName = "01.00.00"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }


}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}