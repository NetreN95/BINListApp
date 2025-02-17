package ru.netren.database.sqldelight.multiplatform

import ru.netren.database.sqldelight.android.SQLDelightSDK
import ru.netren.database.sqldelight.api.SQLDelightSDK

actual fun SQLDelightSDK(
    sqlDelightConfiguration: SQLDelightConfiguration
): SQLDelightSDK {
    return SQLDelightSDK(androidContext = sqlDelightConfiguration.androidContext)
}