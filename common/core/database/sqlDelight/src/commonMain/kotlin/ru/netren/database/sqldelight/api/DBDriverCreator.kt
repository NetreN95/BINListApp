package ru.netren.database.sqldelight.api

import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.db.SqlSchema

interface DBDriverCreator {
    fun createDriver(
        nameDB: String, sqlSchema: SqlSchema<QueryResult.Value<Unit>>
    ): SqlDriver
}