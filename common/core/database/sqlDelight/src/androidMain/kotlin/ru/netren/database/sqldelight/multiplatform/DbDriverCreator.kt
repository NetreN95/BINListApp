package ru.netren.database.sqldelight.multiplatform

import ru.netren.database.sqldelight.android.DBDriverCreator
import ru.netren.database.sqldelight.api.DBDriverCreator

actual fun DBDriverCreator(
    sqlDelightConfiguration: SQLDelightConfiguration
): DBDriverCreator {
    return DBDriverCreator(androidContext = sqlDelightConfiguration.androidContext)
}
