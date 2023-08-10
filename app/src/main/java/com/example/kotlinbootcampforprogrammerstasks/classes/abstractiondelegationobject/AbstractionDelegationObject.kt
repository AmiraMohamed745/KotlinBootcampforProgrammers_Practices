package com.example.kotlinbootcampforprogrammerstasks.classes.abstractiondelegationobject

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

// the implementation of this interface will be in the onbject
// file so it is a SINGLETON which means that any class that
// access the color property will have the color yellow

abstract class Spice(
    var spiceName: String,
    var spiciness: String = "Mild",
    color: SpiceColor

// here the property color is of type SpiceColor, however, you
// do not provide a default implementation for it = FixedFeaturesInSpices
// because this is the parent spice class that any spice
// can inherit from not just yellow spices

) : SpiceColor by color {

    private val heat: Int
        get() = when (spiciness) {
            "Mild" -> 5
            "Spicy" -> 8
            "Very spicy" -> 10
            else -> 0
        }

    abstract fun prepareSpice()

    init {
        println("Name: $spiceName")
        println("Spiciness: $spiciness")
        println("Heat: $heat")
    }

}

class Curry(
    spicinessLevel: String,
) : Spice(spiceName = "Curry", spiciness = spicinessLevel, color = FixedFeaturesInSpices),
    Grinder {
// here you wehn you inherit class Spice, you inherit its
// constructors and change its properties to suit the Curry
// class that is why color now is defaulted to FixedFeaturesInSpices

    override fun prepareSpice() {
        println("Preparing Curry.")
    }

    override fun grind() {
        println("Grinding Curry.")
    }

}