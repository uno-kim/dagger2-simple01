package com.example.dagger.coffee.withdagger

import dagger.Component

@Component(modules = [CoffeeMakerModule::class])
interface CoffeeComponent {

    //provision method
    fun make(): CoffeeMakerDi

    //member-injection method
    fun inject(coffeeMaker: CoffeeMakerDi)
}