package com.example.ymka.di_sample.activity.main

import com.example.ymka.di_sample.DataManager
import com.example.ymka.di_sample.Logger

/**
 * Created by Alexander Kondenko.
 */
class MainPresenter {

    val name : String

    constructor(dataManager: DataManager) {
        Logger.log("Create MainPresenter::class ")
        name = dataManager.mainActivity
    }

}