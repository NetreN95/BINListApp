package ru.netren.database.sqldelight.android

import android.content.Context
import ru.netren.database.sqldelight.api.SQLDelightSDK

fun SQLDelightSDK(
    androidContext: Context
): SQLDelightSDK {
    return SQLDelightSDKForAndroid(androidContext = androidContext)
}

internal class SQLDelightSDKForAndroid(androidContext: Context) : SQLDelightSDK() {
    override val dbDriverCreator = DBDriverCreator(androidContext = androidContext)
}