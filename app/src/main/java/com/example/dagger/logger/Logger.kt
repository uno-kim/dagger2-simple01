package com.example.dagger.logger

import android.util.Log

object Logger {

    private const val TAG = "UNO@"

    @JvmStatic
    fun d(tag: String, msg: String?) {
        Log.d(TAG + tag, msg)
    }

    @JvmStatic
    fun e(tag: String, msg: String?) {
        Log.e(TAG + tag, msg)
    }
}