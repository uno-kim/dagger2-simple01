package com.example.dagger.coffee.withoutdi

import com.example.dagger.coffee.Heater
import com.example.dagger.coffee.Pump
import com.example.dagger.logger.Logger

class Thermosiphon(private val heater: Heater) : Pump {

    companion object {
        private const val TAG = "Thermosiphon"
    }

    init {
        Logger.d(TAG, "Thermosiphon() created")
    }

    override fun pump() {
        if (heater.isHot()) {
            Logger.d(TAG, "=> => pumping => =>")
        }
    }
}