package com.example.ymka.di_sample.di.activity

import com.example.ymka.di_sample.DataManager
import com.example.ymka.di_sample.Logger
import com.example.ymka.di_sample.activity.empty.EmptyPresenter
import com.example.ymka.di_sample.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by Alexander Kondenko.
 */
@Module
class EmptyActivityModule {

    constructor() {
        Logger.log("Create EmptyActivityModule::class")
    }

    @Provides
    @ActivityScope
    fun providePresenter(dataManager: DataManager) = EmptyPresenter(dataManager = dataManager)

}