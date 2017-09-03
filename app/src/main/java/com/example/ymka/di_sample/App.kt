package com.example.ymka.di_sample

import android.app.Activity
import android.app.Application
import android.app.Fragment
import com.example.ymka.di_sample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import javax.inject.Inject

/**
 * Created by Alexander Kondenko.
 */

class App : Application(), HasActivityInjector, HasFragmentInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>
    @Inject
    lateinit var dispatchingFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.create().inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingActivityInjector

    override fun fragmentInjector(): AndroidInjector<Fragment> = dispatchingFragmentInjector

}
