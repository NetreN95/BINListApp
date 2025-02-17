package ru.netren.binlist.di

import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import ru.netren.binlist.database.BINDBCreator
import ru.netren.binlist.db.BINInfoDBOQueries
import ru.netren.binlist.network.retrofit.BINListAPI
import ru.netren.binlist.repository.BINRepository
import ru.netren.binlist.repository.BINRepositoryImpl
import ru.netren.binlist.ui.viewModel.BINViewModel
import ru.netren.binlist.ui.viewModel.BINViewModelImpl
import ru.netren.database.sqldelight.multiplatform.SQLDelightSDK

fun getBINModule(): Module {
    return module {
        factory<BINListAPI> {
            BINListAPI()
        }

        factory<BINInfoDBOQueries> {
            SQLDelightSDK(
                sqlDelightConfiguration = get()
            ).createDatabase(
                dbCreator = BINDBCreator()
            ).bINInfoDBOQueries
        }

        factory<BINRepository> {
            BINRepositoryImpl(
                binListAPI = get(),
                queries = get()
            )
        }

        viewModel<BINViewModel> {
            BINViewModelImpl(
                BINRepository = get()
            )
        }
    }
}