package com.example.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger.coffee.CoffeeApp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coffeeApp = CoffeeApp()
        coffeeApp.runWithoutDi()
        coffeeApp.runWithDi()
        coffeeApp.runWithDagger1()
        coffeeApp.runWithDagger2()
    }
}
