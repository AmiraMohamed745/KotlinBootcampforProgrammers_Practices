package com.example.kotlinbootcampforprogrammerstasks.classes.constructors

class Aquarium(
    var length: Int,
    var width: Int,
    var height: Int
) {

    init {
        println("Length: $length")
        println("Width: $width")
        println("Height: $height")
    }

    constructor(length: Int, width: Int, height: Int, volume: Int, fish: Int) : this(
        length,
        width,
        height
    ) {
        print("Tank status: ")
        if (fish > volume * 2) println("You need a bigger tank.") else println("You're good to go.")
    }
// the secondary constructor HAS to make a call to the primary constructor
// AND it get executed AFTER th init block

}