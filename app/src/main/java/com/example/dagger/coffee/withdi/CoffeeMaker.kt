package com.example.dagger.coffee.withdi

import com.example.dagger.coffee.Heater
import com.example.dagger.coffee.Pump
import com.example.dagger.logger.Logger

class CoffeeMaker(private val heater: Heater, private val pump: Pump) {

    companion object {
        private const val TAG = "CoffeeMaker"
    }

    init {
        Logger.d(TAG, "CoffeeMaker() created")
    }

    fun brew() {
        heater.on()
        pump.pump()
        Logger.d(TAG, " [_]P coffee! [_]P ")
        heater.off()
    }
}