plugins {
    alias(kotlinLibs.plugins.kotlinJvm)
    alias(ktorLibs.plugins.ktorPlugin)
    application
}

group = "ru.netren.testserver"
version = "1.0.0"
application {
    mainClass.set("ru.netren.testserver.ApplicationKt")
    applicationDefaultJvmArgs =
        listOf("-Dio.ktor.development=${extra["io.ktor.development"] ?: "false"}")
}

dependencies {
    implementation(ktorLibs.server.core)
    implementation(ktorLibs.server.netty)
    implementation(otherLibs.logback)

//    testImplementation(ktorLibs.server.tests)
//    testImplementation(kotlinLibs.test.junit)
}