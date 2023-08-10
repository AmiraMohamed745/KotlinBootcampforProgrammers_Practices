package com.example.kotlinbootcampforprogrammerstasks.classes.objectkeyword.companionobject

import kotlin.random.Random
import kotlin.random.nextInt

interface Habitat {
    fun live()
}


open class Sharks {

    //private val waterTemperature = Sharks.Companion
    private val myType: String = "Atlantic"
    private val myAge: Int = 50
    //private val myHabitat = Companion.live()

    init {
        // println("My water temperature is: $waterTemperature")
        println("My type is: $myType")
        println("My age is: $myAge")
        print("My habitat: ")
        Companion.live()
    }

    companion object : Habitat {
        fun getWaterTemperature() = Random.nextInt(20..45)
        const val rocks: Int = 20
        override fun live() = println("I live in the ocean!")
    }
// THE COMPANION OBJECT CAN inherit an interface and implement
// it
}

class Whales : Sharks() {

    private val myType: String = "Indian"
    private val myAge: Int = 40

    private val myAdditionalInfo = Sharks
// by doing this☝🏽, you access the companion object with
// its implementation of the Habitat interface that you
// cannot otherwise inherit even if you make the class
// open

//as making a class open does not mean you can
// access its members (unless you have the keyword open)
// before that member and companion objects CANNOT be
// preceded by the keyword open

    private fun getAdditionalInfo() {
        println("My temperature is: ${myAdditionalInfo.getWaterTemperature()}")
        println("Rocks around me: ${myAdditionalInfo.rocks}")
        print("My habitat: ")
        myAdditionalInfo.live()
    }

    init {
        println("My type is: $myType")
        println("My age is: $myAge")
        getAdditionalInfo()
    }
}

