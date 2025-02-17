package ru.netren.database.sqldelight.multiplatform

import ru.netren.database.sqldelight.api.DBDriverCreator
import ru.netren.database.sqldelight.jvm.DBDriverCreator

actual fun DBDriverCreator(
    sqlDelightConfiguration: SQLDelightConfiguration
): DBDriverCreator {
    return DBDriverCreator()
}