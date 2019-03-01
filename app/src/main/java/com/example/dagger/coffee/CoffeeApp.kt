package com.example.dagger.coffee

import com.example.dagger.coffee.withdagger.CoffeeMakerDi
import com.example.dagger.coffee.withdagger.DaggerCoffeeComponent
import com.example.dagger.coffee.withdi.Injection
import com.example.dagger.coffee.withoutdi.CoffeeMaker
import com.example.dagger.coffee.withoutdi.ElectricHeater
import com.example.dagger.coffee.withoutdi.Thermosiphon
import com.example.dagger.logger.Logger

class CoffeeApp {

    companion object {
        private const val TAG = "CoffeeApp"
    }

    fun runWithoutDi() {
        Logger.d(TAG, "== runWithoutDi START ==")
        val heater = ElectricHeater()
        val pump = Thermosiphon(heater)
        val coffeeMaker = CoffeeMaker(heater, pump)
        coffeeMaker.brew()
        Logger.d(TAG, "== runWithoutDi END ==")
    }

    fun runWithDi() {
        Logger.d(TAG, "== runWithDi START ==")
        Injection.provideCoffeeMaker().brew()
        Logger.d(TAG, "== runWithDi END ==")
    }

    fun runWithDagger1() {
        Logger.d(TAG, "== runWithDagger1 START ==")
        DaggerCoffeeComponent.create().make().brew()
        Logger.d(TAG, "== runWithDagger1 END ==")
    }

    fun runWithDagger2() {
        Logger.d(TAG, "== runWithDagger2 START ==")
        val coffeeMaker = CoffeeMakerDi()
        DaggerCoffeeComponent.create().inject(coffeeMaker)
        coffeeMaker.brew()
        Logger.d(TAG, "== runWithDagger2 END ==")
    }
}