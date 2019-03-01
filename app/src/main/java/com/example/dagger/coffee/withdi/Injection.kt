package com.example.dagger.coffee.withdi

import com.example.dagger.coffee.Heater
import com.example.dagger.coffee.Pump

object Injection {

    fun provideHeater(): Heater = GasHeater()

    fun providePump(): Pump = VibrationPump(provideHeater())

    fun provideCoffeeMaker(): CoffeeMaker = CoffeeMaker(provideHeater(), providePump())
}