package com.example.kotlinbootcampforprogrammerstasks.classes.get

fun main() {

    val aquarium = Aquarium()
    println("First aquarium info:")
    aquarium.buildAquarium()
    println("Volume: ${aquarium.volume}")

    val aquarium2 = Aquarium()
    aquarium2.length = 15
    println("\nSecond aquarium info:")
    aquarium2.buildAquarium()
    println("Volume: ${aquarium2.volume}")
}