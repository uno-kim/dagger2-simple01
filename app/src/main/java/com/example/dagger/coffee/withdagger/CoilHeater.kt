package com.example.dagger.coffee.withdagger

import com.example.dagger.coffee.Heater
import com.example.dagger.logger.Logger

class CoilHeater : Heater {

    companion object {
        private const val TAG = "CoilHeater"
    }

    init {
        Logger.d(TAG, "CoilHeater() created")
    }

    private var heating = false

    override fun on() {
        Logger.d(TAG, "~ ~ ~ heating ~ ~ ~")
        heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot() = heating
}