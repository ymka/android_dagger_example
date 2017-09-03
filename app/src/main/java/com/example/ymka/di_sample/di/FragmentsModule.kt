package com.example.ymka.di_sample.di

import android.app.Fragment
import com.example.ymka.di_sample.di.fragment.GreenFragmentSubComponent
import com.example.ymka.di_sample.fragment.green.GreenFragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.FragmentKey
import dagger.multibindings.IntoMap

/**
 * Created by Alexander Kondenko.
 */
@Module(subcomponents = arrayOf(
        GreenFragmentSubComponent::class
        ))
abstract class FragmentsModule {

    @Binds
    @IntoMap
    @FragmentKey(GreenFragment::class)
    abstract fun bindMainFragmentInjectorFactory(builder: GreenFragmentSubComponent.Builder):
            AndroidInjector.Factory<out Fragment>

}