package com.example.ymka.di_sample.di.activity

import com.example.ymka.di_sample.activity.main.MainActivity
import com.example.ymka.di_sample.di.fragment.MainActivityFragmentBinderModule
import com.example.ymka.di_sample.di.scope.ActivityScope
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by Alexander Kondenko.
 */
@Subcomponent(modules = arrayOf(
        MainActivityModule::class,
        MainActivityFragmentBinderModule::class
))
@ActivityScope
interface MainActivitySubComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

}
