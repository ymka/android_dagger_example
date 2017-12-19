package com.example.ymka.di_sample.di

import com.example.ymka.di_sample.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by Alexander Kondenko.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        ActivityBindingModule::class,
        ContextModule::class,
        AppModule::class
        ))
interface AppComponent {

    fun inject(app: App)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: App): Builder
        fun build(): AppComponent
    }

}
