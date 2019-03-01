package com.example.dagger.coffee.withoutdi

import com.example.dagger.coffee.Heater
import com.example.dagger.logger.Logger

class ElectricHeater : Heater {

    companion object {
        private const val TAG = "ElectricHeater"
    }

    init {
        Logger.d(TAG, "ElectricHeater() created")
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