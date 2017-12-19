package com.example.ymka.di_sample.di.fragment

import com.example.ymka.di_sample.di.scope.FragmentScope
import com.example.ymka.di_sample.fragment.green.GreenFragment
import com.example.ymka.di_sample.fragment.red.RedFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Alexander Kondenko.
 */
@Module
abstract class FragmentBindingModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = arrayOf(GreenFragmentModule::class))
    abstract fun greenFragment(): GreenFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = arrayOf(RedFragmentModule::class))
    abstract fun redFragment(): RedFragment

}
