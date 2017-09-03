package com.example.ymka.di_sample

import android.util.Log

/**
 * Created by Alexander Kondenko.
 */
class Logger {

    companion object {
        fun log(msg: String) {
            Log.d("dagger", msg)
        }
    }

}