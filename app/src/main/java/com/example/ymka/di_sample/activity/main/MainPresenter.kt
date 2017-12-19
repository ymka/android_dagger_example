package com.example.ymka.di_sample.activity.main

import android.content.Context
import com.example.ymka.di_sample.DataManager
import com.example.ymka.di_sample.Logger
import com.example.ymka.di_sample.R

/**
 * Created by Alexander Kondenko.
 */
class MainPresenter {

    val name : String

    constructor(dataManager: DataManager, context: Context, stringProvider: MainActivityStringProvider) {
        Logger.log("Create MainPresenter::class ")
        name = dataManager.mainActivity
        Logger.log(context.getString(R.string.app_name))
    }

}
