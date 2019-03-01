package com.example.dagger.coffee.withdagger

import com.example.dagger.coffee.Heater
import com.example.dagger.coffee.Pump
import dagger.Module
import dagger.Provides

@Module
class CoffeeMakerModule {

    @Provides
    fun provideHeater(): Heater = CoilHeater()

    @Provides
    fun providePump(heater: Heater): Pump = RotaryPump(heater)
}