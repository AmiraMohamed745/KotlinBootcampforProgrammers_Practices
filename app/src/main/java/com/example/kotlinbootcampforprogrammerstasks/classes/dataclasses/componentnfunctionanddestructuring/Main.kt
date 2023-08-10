package com.example.kotlinbootcampforprogrammerstasks.classes.dataclasses.componentnfunctionanddestructuring

fun main() {

// simply printing the object of the data class
    val decorations = Decorations("Rocks", 5, "Bottom")
    println(decorations)
    println("\n")

// making variable that access the copmonents of the
// data class
    val decorationsType = decorations.component1()
    val decorationsNumber = decorations.component2()
    val decorationsPosition = decorations.component3()
    println("Decorations info: add $decorationsNumber $decorationsType at the $decorationsPosition")
    println("\n")

// destructuring
    val (type, number, position) = decorations
    println(type)
    println(number)
    println(position)
    println("\n")

// accessing the components directly without variables
    println("Decoration type: ${decorations.component1()}")
    println("Decoration number: ${decorations.component2()}")
    println("Decoration position: ${decorations.component3()}")
    println("\n")

// pritning the object of a normal class when using a toString()
    val decoration = Decoration("Rocks", 5, "Bottom")
    println(decoration)
}