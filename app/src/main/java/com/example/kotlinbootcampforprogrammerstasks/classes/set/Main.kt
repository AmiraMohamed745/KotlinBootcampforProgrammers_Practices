package com.example.kotlinbootcampforprogrammerstasks.classes.set

fun main() {

    val aquarium = Aquarium()
    println("First aquarium info:")
    aquarium.buildAquarium()
    println("Volume: ${aquarium.volume}")
    aquarium.fish = 23.toString()
// we had to ass .toString as the property fish is of type String
    println("Number of fish: ${aquarium.fish}")

    val aquarium2 = Aquarium()
    aquarium2.length = 15
    println("\nSecond aquarium info:")
    aquarium2.buildAquarium()
    println("Volume: ${aquarium2.volume}")
    aquarium2.fish = 30.toString()
    println("Number of fish: ${aquarium2.fish}")

}