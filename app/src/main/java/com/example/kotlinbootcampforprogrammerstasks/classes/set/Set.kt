package com.example.kotlinbootcampforprogrammerstasks.classes.set

class Aquarium {
    var length: Int = 10
    var width: Int = 20
    var height: Int = 30
    val volume get() = length * width * height
    var fish: String = ""
        set(value) {
            field = if (volume >= 9000) "You can add up to 50 fishes."
            else value
// inside the set() of fish we put a condition containing another
// property (volume)
        }
    fun buildAquarium() {

        println("Length: $length")
        println("Width: $width")
        println("Height: $height")
    }

}