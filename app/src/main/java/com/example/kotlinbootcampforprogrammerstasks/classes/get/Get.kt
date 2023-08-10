package com.example.kotlinbootcampforprogrammerstasks.classes.get

class Aquarium {
    var length: Int = 10
    var width: Int = 20
    var height: Int = 30
    val volume get() = length * width * height
// we use get() when we desire to do an operation to get a property

    fun buildAquarium() {

        println("Length: $length")
        println("Width: $width")
        println("Height: $height")
    }
}