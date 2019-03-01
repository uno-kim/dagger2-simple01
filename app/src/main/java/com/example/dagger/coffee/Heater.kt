package com.example.dagger.coffee

interface Heater {
    fun on()
    fun off()
    fun isHot(): Boolean
}