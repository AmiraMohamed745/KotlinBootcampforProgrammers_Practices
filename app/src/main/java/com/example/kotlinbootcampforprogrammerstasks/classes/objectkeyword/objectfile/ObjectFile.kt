package com.example.kotlinbootcampforprogrammerstasks.classes.objectkeyword.objectfile

class Fish : FishType by FishTypeImplemented(),
    FishColor by FishColorImplemented(),
    FishFood by FixedProperties,
    Habitat by FixedProperties
// notice that both interface FishFood and Habitat are
// implemented by the object declaration FixedProperties

interface FishType {
    fun getFish(fish: String)
}

interface FishColor {
    fun getColor(color: String)
}

interface FishFood {
    fun eat()

    fun noEat()
}

interface Habitat {
    fun getHabitat()
}

class FishTypeImplemented : FishType {
    override fun getFish(fish: String) {
        println("I am a $fish.")
    }
}

class FishColorImplemented : FishColor {
    override fun getColor(color: String) {
        println("I am of color $color.")
    }
}