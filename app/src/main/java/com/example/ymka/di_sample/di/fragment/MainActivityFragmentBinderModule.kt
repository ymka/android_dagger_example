package com.example.ymka.di_sample.di.fragment

import android.app.Fragment
import com.example.ymka.di_sample.fragment.red.RedFragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.FragmentKey
import dagger.multibindings.IntoMap

/**
 * Created by Alexander Kondenko.
 */
@Module(subcomponents = arrayOf(RedFragmentSubComponent::class))
abstract class MainActivityFragmentBinderModule {

    @Binds
    @IntoMap
    @FragmentKey(RedFragment::class)
    abstract fun bindSecondFragmentInjectorFactory(builder: RedFragmentSubComponent.Builder):
            AndroidInjector.Factory<out Fragment>

}