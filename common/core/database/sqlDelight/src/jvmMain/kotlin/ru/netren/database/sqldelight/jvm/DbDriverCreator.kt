package ru.netren.database.sqldelight.jvm

import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.db.SqlSchema
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import ru.netren.database.sqldelight.api.DBDriverCreator

fun DBDriverCreator(): DBDriverCreator {
    return DBDriverCreatorForJVM()
}

internal class DBDriverCreatorForJVM : DBDriverCreator {
    override fun createDriver(
        nameDB: String,
        sqlSchema: SqlSchema<QueryResult.Value<Unit>>
    ): SqlDriver {
        val driver: SqlDriver = JdbcSqliteDriver("jdbc:sqlite:$nameDB.db")
        sqlSchema.create(driver)

        return driver
    }
}