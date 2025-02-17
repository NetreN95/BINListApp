package ru.netren.binlist.app.android

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ru.netren.binlist.di.getBINModule

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            modules(
                getBINModule(),
                getPlatformModule()
            )
        }
    }
}