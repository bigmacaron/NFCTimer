plugins {
    alias(libs.plugins.nfc.timer.library)
    alias(libs.plugins.nfc.timer.hilt)
}

android {
    namespace = "kr.kro.fatcats.nfctimer.analytics"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}