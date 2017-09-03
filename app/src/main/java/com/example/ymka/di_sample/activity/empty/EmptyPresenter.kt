package com.example.ymka.di_sample.activity.empty

import com.example.ymka.di_sample.DataManager
import com.example.ymka.di_sample.Logger

/**
 * Created by Alexander Kondenko.
 */
class EmptyPresenter {

    val name: String

    constructor(dataManager: DataManager) {
        Logger.log("Create EmptyPresenter::class ")
        name = dataManager.secondActivity
    }

}