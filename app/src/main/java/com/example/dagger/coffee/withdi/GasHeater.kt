package com.example.dagger.coffee.withdi

import com.example.dagger.coffee.Heater
import com.example.dagger.logger.Logger

class GasHeater : Heater {

    companion object {
        private const val TAG = "GasHeater"
    }

    init {
        Logger.d(TAG, "GasHeater() created")
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