import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import org.koin.core.context.startKoin
import ru.netren.binlist.di.getBINModule
import ru.netren.binlist.main.App

fun main() {
    application {
        startKoin {
            modules(
                getBINModule(),
                getPlatformModule()
            )
        }

        Window(
            title = "BIN App",
            onCloseRequest = ::exitApplication,
            state = WindowState(
                size = DpSize(400.dp, 800.dp)
            ),
            resizable = false
        ) {
            App()
        }
    }
}