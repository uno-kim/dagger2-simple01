package com.example.dagger.coffee.withdagger

import com.example.dagger.coffee.Heater
import com.example.dagger.coffee.Pump
import com.example.dagger.logger.Logger

import javax.inject.Inject

class CoffeeMakerDi {
    companion object {
        private const val TAG = "CoffeeMakerDi"
    }

    @Inject
    internal lateinit var heater: Heater
    @Inject
    internal lateinit var pump: Pump

    constructor() {
        Logger.d(TAG, "CoffeeMakerDi() created1")
    }

    @Inject
    constructor(heater: Heater, pump: Pump) {
        Logger.d(TAG, "CoffeeMakerDi() created2")
        this.heater = heater
        this.pump = pump
    }

    fun brew() {
        heater.on()
        pump.pump()
        Logger.d(TAG, " [_]P coffee! [_]P ")
        heater.off()
    }
}
