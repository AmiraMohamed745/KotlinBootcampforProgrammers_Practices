package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.constants.memberofcomanion

// 3- MEMBER OF A COMPANION OBJECT

class Fish(val name: String, val size: String) {

    init {
        println("Name: $name")
        println("Size: $size")
        println("Rocks: $ROCKS")
    }

    companion object {
        const val ROCKS = 10
    }

}

class Flowers(val name: String, val color: String) {

    init {
        println("Name: $name")
        println("Color: $color")
        println("Rocks: $ROCKS")
    }

    companion object {
        const val ROCKS = 20
    }

}