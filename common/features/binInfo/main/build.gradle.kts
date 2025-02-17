plugins {
    alias(gradlePluginsLibs.plugins.kotlinMultiplatform)
    alias(gradlePluginsLibs.plugins.jetbrainsCompose)
    alias(gradlePluginsLibs.plugins.composeCompiler)
    alias(sqlDelightLibs.plugins.sqlDelight)
}

sqldelight {
    databases {
        create("BINDB") {
            packageName.set("ru.netren.binlist.db")
        }
    }
}

kotlin {
    jvm()
    sourceSets {
        commonMain {
            dependencies {
                api(projects.common.core.ui.compose)
                api(projects.common.core.ui.viewModel.jetbrains)
                api(projects.common.core.network.retrofit)
                api(projects.common.core.database.sqlDelight)
            }
        }
    }
}