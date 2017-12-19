package com.example.ymka.di_sample.di

import android.content.Context
import com.example.ymka.di_sample.App
import dagger.Binds
import dagger.Module

/**
 * Created by Alexander Kondenko.
 */
@Module
abstract class ContextModule {

    @Binds
    abstract fun context(app: App): Context

}
