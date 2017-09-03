package com.example.ymka.di_sample.activity.main

import android.app.Fragment
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ymka.di_sample.Logger
import com.example.ymka.di_sample.R
import com.example.ymka.di_sample.activity.empty.EmptyActivity
import com.example.ymka.di_sample.fragment.green.GreenFragment
import com.example.ymka.di_sample.fragment.red.RedFragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import javax.inject.Inject

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), HasFragmentInjector {

    @Inject
    lateinit var dispatchingFragmentInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Logger.log("Create MainActivity::class")
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)
        val fragment = GreenFragment()
        fragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit()
        startSecondActivityBtn.setOnClickListener {
            startActivity(Intent(this, EmptyActivity::class.java)) }

        replaceFragment.setOnClickListener { replaceFragment() }
    }

    fun replaceFragment() {
        val currentFragment = fragmentManager.findFragmentById(R.id.fragment_container)
        val fragment: Fragment
        when(currentFragment) {
            is GreenFragment -> fragment = RedFragment()
            else -> fragment = GreenFragment()
        }

        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
    }

    override fun fragmentInjector(): AndroidInjector<Fragment> = dispatchingFragmentInjector
}
