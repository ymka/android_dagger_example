package com.example.ymka.di_sample.fragment.red

import com.example.ymka.di_sample.DataManager
import com.example.ymka.di_sample.Logger

/**
 * Created by Alexander Kondenko.
 */
class RedPresenter {

    val name: String

    constructor(dataManager: DataManager) {
        Logger.log("Create RedPresenter::class")
        name = dataManager.secondFragment
    }

}
