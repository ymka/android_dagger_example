package com.example.ymka.di_sample.di

import android.content.Context
import com.example.ymka.di_sample.App
import dagger.Binds
import dagger.Module

/**
 * Created by Alexander Kondenko.
 */
@Module
abstract class ApplicationModule {

    @Binds
    abstract fun bindConetxt(app: App): Context

}
