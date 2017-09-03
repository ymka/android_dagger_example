package com.example.ymka.di_sample.di.activity

import com.example.ymka.di_sample.activity.empty.EmptyActivity
import com.example.ymka.di_sample.di.scope.ActivityScope
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by Alexander Kondenko.
 */
@Subcomponent(modules = arrayOf(EmptyActivityModule::class))
@ActivityScope
interface EmptyActivitySubComponent : AndroidInjector<EmptyActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<EmptyActivity>()

}