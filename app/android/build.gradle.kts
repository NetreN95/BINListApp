plugins {
    alias(gradlePluginsLibs.plugins.kotlinMultiplatform)
    alias(gradlePluginsLibs.plugins.androidApplication)
    alias(gradlePluginsLibs.plugins.jetbrainsCompose)
    alias(gradlePluginsLibs.plugins.composeCompiler)
}

android {
    namespace = "ru.netren.binlist.app.android"
    compileSdk = androidLibs.versions.compileSdk.get().toInt()


    defaultConfig {
        applicationId = "ru.netren.binlist"
        minSdk = androidLibs.versions.minSdk.get().toInt()
    }
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.12"
    }
}

kotlin {
    androidTarget()
    sourceSets {
        androidMain {
            dependencies {
                api(projects.common.core.platform)
                api(projects.common.core.ui.compose)
                implementation(projects.common.main)
                implementation(projects.common.core.database.sqlDelight)
            }
        }
    }
}