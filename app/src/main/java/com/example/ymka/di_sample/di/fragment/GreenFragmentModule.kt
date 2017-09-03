package com.example.ymka.di_sample.di.fragment

import com.example.ymka.di_sample.DataManager
import com.example.ymka.di_sample.Logger
import com.example.ymka.di_sample.di.scope.FragmentScope
import com.example.ymka.di_sample.fragment.green.GreenPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Alexander Kondenko.
 */
@Module
class GreenFragmentModule {

    constructor() {
        Logger.log("Create GreenFragmentModule::class")
    }

    @Provides
    @FragmentScope
    fun providePresenter(dataManager: DataManager) = GreenPresenter(dataManager)

}