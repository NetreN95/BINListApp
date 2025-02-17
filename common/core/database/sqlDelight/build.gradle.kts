plugins {
    alias(gradlePluginsLibs.plugins.kotlinMultiplatform)
    alias(gradlePluginsLibs.plugins.androidLibrary)
}

android {
    namespace = "ru.netren.sqldelightsdk"
    compileSdk = androidLibs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = androidLibs.versions.minSdk.get().toInt()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

kotlin {
    jvm()
    androidTarget()

    sourceSets {
        commonMain {
            dependencies {
                api(databaseLibs.sqlDelight.core)
                api(sqlDelightLibs.coroutines)
            }
        }

        jvmMain {
            dependencies {
                api(databaseLibs.sqlDelight.desktop)
            }
        }

        androidMain {
            dependencies {
                api(databaseLibs.sqlDelight.android)
            }
        }
    }
}