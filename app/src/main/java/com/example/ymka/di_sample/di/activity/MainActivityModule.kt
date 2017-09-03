package com.example.ymka.di_sample.di.activity

import com.example.ymka.di_sample.DataManager
import com.example.ymka.di_sample.Logger
import com.example.ymka.di_sample.activity.main.MainActivityStringProvider
import com.example.ymka.di_sample.di.scope.ActivityScope
import com.example.ymka.di_sample.activity.main.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Alexander Kondenko.
 */
@Module
class MainActivityModule {

    constructor() {
        Logger.log("Create MainActivityModule::class")
    }

    @Provides
    @ActivityScope
    fun providePresenter(dataManager: DataManager) = MainPresenter(dataManager)

    @Provides
    @ActivityScope
    fun provideDataManager() = MainActivityStringProvider()

}