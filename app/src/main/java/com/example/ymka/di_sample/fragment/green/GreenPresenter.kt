package com.example.ymka.di_sample.fragment.green

import com.example.ymka.di_sample.DataManager
import com.example.ymka.di_sample.Logger

/**
 * Created by Alexander Kondenko.
 */
class GreenPresenter {

    val name: String

    constructor(dataManager: DataManager) {
        Logger.log("Create GreenPresenter::class ")
        name = dataManager.mainFragment
    }

}