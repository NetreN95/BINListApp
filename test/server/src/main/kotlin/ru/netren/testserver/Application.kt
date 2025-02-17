package ru.netren.testserver

import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun main() {
    embeddedServer(Netty, port = SERVER_PORT, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    routing {
        get("/") {
            call.respondText("Ktor: ${Greeting().greet()}")
        }

        get("/{bin}") {
//            if (call.parameters["bin"] == "55369140") {
//                call.respondText("BIN is filled")
//            } else {
//                call.respondText("{ \"number\": { \"length\": 16, \"luhn\": true }, \"scheme\": \"visa\", \"type\": \"debit\", \"brand\": \"Visa/Dankort\", \"prepaid\": false, \"country\": { \"numeric\": \"208\", \"alpha2\": \"DK\", \"name\": \"Denmark\", \"emoji\": \"\uD83C\uDDE9\uD83C\uDDF0\", \"currency\": \"DKK\", \"latitude\": 56, \"longitude\": 10 }, \"bank\": { \"name\": \"Jyske Bank\", \"url\": \"www.jyskebank.dk\", \"phone\": \"+4589893300\", \"city\": \"Hjørring\" } }")
//            }

//            call.respondText("{ \"number\": { \"length\": 16, \"luhn\": true }, \"scheme\": \"visa\", \"type\": \"debit\", \"brand\": \"Visa/Dankort\", \"prepaid\": false, \"country\": { \"numeric\": \"208\", \"alpha2\": \"DK\", \"name\": \"Denmark\", \"emoji\": \"\uD83C\uDDE9\uD83C\uDDF0\", \"currency\": \"DKK\", \"latitude\": 56, \"longitude\": 10 }, \"bank\": { \"name\": \"Jyske Bank\", \"url\": \"www.jyskebank.dk\", \"phone\": \"+4589893300\", \"city\": \"Hjørring\" } }")
            call.respondText("{\"number\":null,\"country\":{},\"bank\":{}}")
        }
    }
}