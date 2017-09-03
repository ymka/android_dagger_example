package com.example.ymka.di_sample.activity.empty

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.ymka.di_sample.Logger
import dagger.android.AndroidInjection
import javax.inject.Inject

/**
 * Created by Alexander Kondenko.
 */
class EmptyActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: EmptyPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Logger.log("Create EmptyActivity::class")
        AndroidInjection.inject(this)
        presenter.name
    }
}