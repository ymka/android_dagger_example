package com.example.ymka.di_sample.di.fragment

import com.example.ymka.di_sample.di.scope.FragmentScope
import com.example.ymka.di_sample.fragment.green.GreenFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by Alexander Kondenko.
 */
@Subcomponent(modules = arrayOf(GreenFragmentModule::class))
@FragmentScope
interface GreenFragmentSubComponent : AndroidInjector<GreenFragment> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<GreenFragment>()

}