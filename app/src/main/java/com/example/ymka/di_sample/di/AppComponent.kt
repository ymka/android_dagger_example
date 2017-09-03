package com.example.ymka.di_sample.di

import com.example.ymka.di_sample.App
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by Alexander Kondenko.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        ActivitiesModule::class,
        FragmentsModule::class
        ))
interface AppComponent {

    fun inject(app: App)

}