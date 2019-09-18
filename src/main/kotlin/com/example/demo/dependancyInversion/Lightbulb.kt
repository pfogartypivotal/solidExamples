package com.example.demo.dependancyInversion

class SmartHome {
    var myBulb: MyBulb? = null

    fun setTheBulb(newBulb: MyBulb) {
        myBulb = newBulb
    }
    fun toggleBulb() {
        myBulb?.toggleOn()
    }
}

interface MyBulb {
    var on: Boolean

    fun getTheOn(): Boolean
    fun toggleOn()
}

class SmartBulb: MyBulb {
    override var on: Boolean = false

    override fun getTheOn(): Boolean { return on }
    override fun toggleOn() { this.setTheOn(!on) }
    private fun setTheOn(newVal: Boolean) { on = newVal }
}