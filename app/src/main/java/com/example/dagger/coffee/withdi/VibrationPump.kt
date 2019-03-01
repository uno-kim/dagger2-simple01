package com.example.dagger.coffee.withdi

import com.example.dagger.coffee.Heater
import com.example.dagger.coffee.Pump
import com.example.dagger.logger.Logger

class VibrationPump(private val heater: Heater) : Pump {

    companion object {
        private const val TAG = "VibrationPump"
    }

    init {
        Logger.d(TAG, "VibrationPump() created")
    }

    override fun pump() {
        if (heater.isHot()) {
            Logger.d(TAG, "=> => pumping => =>")
        }
    }
}