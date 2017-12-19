package com.example.ymka.di_sample.di

import com.example.ymka.di_sample.activity.empty.EmptyActivity
import com.example.ymka.di_sample.activity.main.MainActivity
import com.example.ymka.di_sample.di.activity.EmptyActivityModule
import com.example.ymka.di_sample.di.activity.MainActivityModule
import com.example.ymka.di_sample.di.fragment.FragmentBindingModule
import com.example.ymka.di_sample.di.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Alexander Kondenko.
 */
@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(FragmentBindingModule::class, MainActivityModule::class))
    abstract fun mainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(EmptyActivityModule::class))
    abstract fun secondActivity(): EmptyActivity

}
