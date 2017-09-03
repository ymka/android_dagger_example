package com.example.ymka.di_sample.fragment.red

import com.example.ymka.di_sample.DataManager
import com.example.ymka.di_sample.Logger
import com.example.ymka.di_sample.activity.main.MainActivityStringProvider

/**
 * Created by Alexander Kondenko.
 */
class RedPresenter {

    val name: String

    constructor(dataManager: DataManager, activityManager: MainActivityStringProvider) {
        Logger.log("Create RedPresenter::class")
        name = dataManager.secondFragment + " " + activityManager.data
    }

}