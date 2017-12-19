package com.example.ymka.di_sample.activity.main

import android.content.Context
import com.example.ymka.di_sample.Logger

/**
 * Created by Alexander Kondenko.
 */
class MainActivityStringProvider {

    val data = "Main activity data"

    constructor(context: Context) {
        Logger.log("Create MainActivityStringProvider::class")
    }

}
