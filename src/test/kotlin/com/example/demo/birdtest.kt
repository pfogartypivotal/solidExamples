package com.example.demo

import com.example.demo.Substitution.*
import org.junit.Test

class testThing {
    @Test
    fun `birds do things`() {
        val birdList: List<Bird> = listOf(
                Duck(), Duck(), Goose(), Ostritch()
        )

        birdList.forEach{ it.noise() }
        birdList.forEach{
            when(it) {
                is FlyingBird -> it.fly()
            }
        }
        birdList.forEach{ it.mandatoryMethod() }
    }
}