package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.constants.toplevel

// 1- TOP-LEVEL

const val ROCKS = 10

class Fish(val name: String, val size: String) {

    init {
        println("Name: $name")
        println("Size: $size")
        println("Rocks: $ROCKS}")
    }
}

class Flowers(val name: String, val color: String) {

    init {
        println("Name: $name")
        println("Color: $color")
        println("Rocks: $ROCKS")
    }

}