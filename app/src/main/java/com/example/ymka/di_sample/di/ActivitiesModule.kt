package com.example.ymka.di_sample.di

import android.app.Activity
import com.example.ymka.di_sample.activity.main.MainActivity
import com.example.ymka.di_sample.activity.empty.EmptyActivity
import com.example.ymka.di_sample.di.activity.MainActivitySubComponent
import com.example.ymka.di_sample.di.activity.EmptyActivitySubComponent
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by Alexander Kondenko.
 */

@Module(subcomponents = arrayOf(MainActivitySubComponent::class,
                                EmptyActivitySubComponent::class))
abstract class ActivitiesModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(builder: MainActivitySubComponent.Builder):
            AndroidInjector.Factory<out Activity>

    @Binds
    @IntoMap
    @ActivityKey(EmptyActivity::class)
    abstract fun bindSecondActivityInjectorFactory(builder: EmptyActivitySubComponent.Builder):
            AndroidInjector.Factory<out Activity>
}