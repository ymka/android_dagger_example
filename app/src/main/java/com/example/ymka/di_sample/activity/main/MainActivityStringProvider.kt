package com.example.ymka.di_sample.activity.main

import com.example.ymka.di_sample.Logger

/**
 * Created by Alexander Kondenko.
 */
class MainActivityStringProvider {

    val data = "Main activity data"

    constructor() {
        Logger.log("Create MainActivityStringProvider::class")
    }

}