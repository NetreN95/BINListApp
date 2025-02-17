package ru.netren.database.sqldelight.jvm

import ru.netren.database.sqldelight.api.SQLDelightSDK


class SQLDelightSDKForJVM : SQLDelightSDK() {
    override val dbDriverCreator = DBDriverCreator()
}
