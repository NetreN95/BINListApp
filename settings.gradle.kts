enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }

            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()

        maven {
            url = uri("https://company/com/maven2")
        }
    }
    versionCatalogs {
        createLibs()
    }
}

rootProject.name = "BINApp"

includeProject()

fun includeProject() {
    includeCore()
    includeFeatures()
    includeMain()
    includeApp()
//    includeTestServer()
}

fun includeTestServer() {
    include(":test:server")
}

fun includeCore() {
    include(":common:core:coroutines")
    include(":common:core:network:retrofit")
    include(":common:core:database:sqlDelight")
    include(":common:core:DI:koin")
    include(":common:core:platform")

    include(":common:core:UI:compose")
    include(":common:core:UI:viewModel:jetbrains")
}

fun includeFeatures() {
    includeBINFeature()
}

fun includeMain() {
    include(":common:main")
}

fun includeApp() {
    include(":app:desktop")
    include(":app:android")
}

fun includeBINFeature() {
    include(":common:features:binInfo:main")
}

fun createLibs() {
    createLib("kotlin")
    createLib("compose")
    createLib("android")
    createLib("database")
    createLib("network")
    createLib("navigation")
    createLib("viewModel")
    createLib("di")
    createLib("images")
    createLib("gradlePlugins")
    createLib("ktor")
    createLib("other")
    createLib("sqlDelight")
}

fun createLib(libName: String) {
    val dir = "gradle/libs/"
    createLibFromFile("${libName}Libs", "${dir}${libName}.toml")
}

fun createLibFromFile(libName: String, libPath: String) {
    dependencyResolutionManagement {
        versionCatalogs {
            create(libName) {
                from(files(libPath))
            }
        }
    }
}