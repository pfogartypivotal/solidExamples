package com.example.demo

import com.example.demo.dependancyInversion.SmartBulb
import com.example.demo.dependancyInversion.SmartHome
import org.junit.Test

class SmartHomeTest {
    @Test
    fun `toggle the bulb`() {
        val smartHome = SmartHome()
        val aSmartBulb = SmartBulb()
        smartHome.setTheBulb(aSmartBulb)

        println("My bulb is currently set to: " + smartHome.myBulb!!.on)

        smartHome.toggleBulb()

        println("My bulb is currently set to: " + smartHome.myBulb!!.on)
    }
}