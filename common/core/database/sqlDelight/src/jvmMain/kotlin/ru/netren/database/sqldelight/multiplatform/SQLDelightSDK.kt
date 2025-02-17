package ru.netren.database.sqldelight.multiplatform

import ru.netren.database.sqldelight.api.SQLDelightSDK
import ru.netren.database.sqldelight.jvm.SQLDelightSDKForJVM

actual fun SQLDelightSDK(sqlDelightConfiguration: SQLDelightConfiguration): SQLDelightSDK {
    return SQLDelightSDKForJVM()
}
