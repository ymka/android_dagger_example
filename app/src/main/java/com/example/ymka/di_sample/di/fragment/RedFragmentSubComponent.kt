package com.example.ymka.di_sample.di.fragment

import com.example.ymka.di_sample.di.scope.FragmentScope
import com.example.ymka.di_sample.fragment.red.RedFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by Alexander Kondenko.
 */
@Subcomponent(modules = arrayOf(RedFragmentModule::class))
@FragmentScope
interface RedFragmentSubComponent : AndroidInjector<RedFragment> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<RedFragment>()

}