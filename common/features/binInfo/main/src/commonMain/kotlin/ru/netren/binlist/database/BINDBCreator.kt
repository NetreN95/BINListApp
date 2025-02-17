package ru.netren.binlist.database

import ru.netren.binlist.db.BINDB
import ru.netren.database.sqldelight.api.DBCreator
import ru.netren.database.sqldelight.api.DBDriverCreator

class BINDBCreator(
    override val nameDB: String = "BINDB"
) : DBCreator<BINDB> {
    override fun createDatabase(dbDriverCreator: DBDriverCreator): BINDB {
        return BINDB(
            dbDriverCreator.createDriver(
                nameDB = nameDB,
                sqlSchema = BINDB.Schema
            )
        )
    }
}