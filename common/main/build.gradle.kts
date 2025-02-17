plugins {
    alias(gradlePluginsLibs.plugins.kotlinMultiplatform)
    alias(gradlePluginsLibs.plugins.jetbrainsCompose)
    alias(gradlePluginsLibs.plugins.composeCompiler)

//    alias(gradlePluginsLibs.plugins.androidLibrary)
}

//android {
//    namespace = "ru.netren.binlist"
//    compileSdk = androidLibs.versions.compileSdk.get().toInt()
//
//    defaultConfig {
//        minSdk = androidLibs.versions.minSdk.get().toInt()
//    }
//
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_17
//        targetCompatibility = JavaVersion.VERSION_17
//    }
//}

kotlin {
    jvm()
//    androidTarget()

    sourceSets {
        commonMain {
            dependencies {
                implementation(projects.common.features.binInfo.main)
                api(projects.common.core.di.koin)
                api(projects.common.core.ui.compose)
            }
        }
    }
}