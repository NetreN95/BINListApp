package ru.netren.binlist.app.android

import org.koin.core.module.Module
import org.koin.dsl.module
import ru.netren.database.sqldelight.multiplatform.SQLDelightConfiguration

fun getPlatformModule(): Module {
    return module {
        factory<SQLDelightConfiguration> {
            SQLDelightConfiguration(
                androidContext = get()
            )
        }
    }
}