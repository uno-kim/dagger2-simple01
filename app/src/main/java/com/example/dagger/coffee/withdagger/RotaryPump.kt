package com.example.dagger.coffee.withdagger

import com.example.dagger.coffee.Heater
import com.example.dagger.coffee.Pump
import com.example.dagger.logger.Logger

class RotaryPump(private val heater: Heater) : Pump {

    companion object {
        private const val TAG = "RotaryPump"
    }

    init {
        Logger.d(TAG, "RotaryPump() created")
    }

    override fun pump() {
        if (heater.isHot()) {
            Logger.d(TAG, "=> => pumping => =>")
        }
    }
}