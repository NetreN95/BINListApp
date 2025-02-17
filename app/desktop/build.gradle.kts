plugins {
    alias(gradlePluginsLibs.plugins.kotlinJvm)
    alias(gradlePluginsLibs.plugins.jetbrainsCompose)
    alias(gradlePluginsLibs.plugins.composeCompiler)
}

dependencies {
    implementation(projects.common.main)

    implementation(projects.common.core.ui.compose)
    implementation(projects.common.core.database.sqlDelight)
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}