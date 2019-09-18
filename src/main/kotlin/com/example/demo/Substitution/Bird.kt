package com.example.demo.Substitution

abstract class Bird {
    open fun noise() { println("tweet") }
    abstract fun mandatoryMethod()
}

abstract class FlyingBird: Bird() {
    open fun fly() { println( "flying away") }
}

open class Goose : FlyingBird() {
    override fun noise() { println("honk") }
    override fun mandatoryMethod() {
        println("i did it")
    }
}

class CanadianGoose: Goose() {
    override fun mandatoryMethod() {
        println("i did it, eh")
    }
}

class Duck : FlyingBird() {
    override fun noise() { println("quack") }
    override fun fly() { println( "flying south") }
    override fun mandatoryMethod() {
        println("i did it too")
    }
}

class Ostritch : Bird() {
    override fun mandatoryMethod() {
        println("i cannot fly good")
    }
}