package ru.netren.database.sqldelight.api

import app.cash.sqldelight.TransacterBase

interface DBCreator<T : TransacterBase> {
    val nameDB: String
    fun createDatabase(dbDriverCreator: DBDriverCreator): T
}