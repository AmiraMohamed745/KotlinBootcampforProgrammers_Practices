package com.example.kotlinbootcampforprogrammerstasks.classes.abstractiondelegationobject

fun main() {

    fun makeSpice() {

        val curry = Curry("Very spicy")
        println("Color: ${curry.color}")

// you have to print that line here because if you add to the init
// block in the parent class Spice the outcome will be the
// place of the object in memory NOT the word yellow as in
// the parent class all that is known about color is that
// it is of type interface SpiceColor

        curry.prepareSpice()
        curry.grind()

    }

    makeSpice()
}
