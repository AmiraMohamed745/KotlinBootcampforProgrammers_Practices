package com.example.kotlinbootcampforprogrammerstasks.classes.inheritance

import kotlin.math.PI

open class Aquarium(
    var length: Int,
    var width: Int,
    var height: Int,
) {

    open val volume
        get() = length * width * height

    open var fish: String = ""
        set(value) {
            field = if (volume >= 9000) "You can add up to 50 fishes." else value
        }

    init {
        println("Length: $length")
        println("Width: $width")
        println("Height: $height")
    }
}

class SecondAquarium(length: Int, width: Int, height: Int) :
    Aquarium(length, width, height.also { println("Rocks: ${it - 20}") }) {
// use it


    override val volume
        get() = length * width * height * PI.toInt()

    override var fish: String = ""
        set(value) {
            field = if (volume >= 60000) "You can add up to 100 fishes." else value
        }

}