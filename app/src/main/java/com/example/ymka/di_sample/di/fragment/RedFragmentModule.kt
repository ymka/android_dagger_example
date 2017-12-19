package com.example.ymka.di_sample.di.fragment

import com.example.ymka.di_sample.DataManager
import com.example.ymka.di_sample.Logger
import com.example.ymka.di_sample.fragment.red.RedPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Alexander Kondenko.
 */
@Module
class RedFragmentModule {

    constructor() {
        Logger.log("Create RedFragmentModule::class")
    }

    @Provides
    fun providePresenter(dataManager: DataManager) =
            RedPresenter(dataManager)

}
