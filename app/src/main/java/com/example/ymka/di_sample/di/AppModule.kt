package com.example.ymka.di_sample.di

import com.example.ymka.di_sample.DataManager
import com.example.ymka.di_sample.Logger
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Alexander Kondenko.
 */
@Module
class AppModule {

    constructor() {
        Logger.log("Create AppModule::class")
    }

    @Provides
    @Singleton
    fun provideDataManager() = DataManager()

}