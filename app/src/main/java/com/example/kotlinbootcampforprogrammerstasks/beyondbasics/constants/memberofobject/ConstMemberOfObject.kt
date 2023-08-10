package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.constants.memberofobject

// 2- MEMBER OF AN OBJET

object Constants {

    const val ROCKS = 10

}

class Fish(val name: String, val size: String) {

    init {
        println("Name: $name")
        println("Size: $size")
        println("Rocks: ${Constants.ROCKS}")
    }
}

class Flowers(val name: String, val color: String) {

    init {
        println("Name: $name")
        println("Color: $color")
        println("Rocks: ${Constants.ROCKS}")
    }

}