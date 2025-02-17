package ru.netren.database.sqldelight.multiplatform

import ru.netren.database.sqldelight.api.DBDriverCreator

expect fun DBDriverCreator(sqlDelightConfiguration: SQLDelightConfiguration): DBDriverCreator