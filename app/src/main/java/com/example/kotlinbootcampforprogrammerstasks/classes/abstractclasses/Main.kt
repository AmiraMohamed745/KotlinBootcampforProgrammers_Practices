package com.example.kotlinbootcampforprogrammerstasks.classes.abstractclasses

fun main() {
    println("First aquarium with ALL features:")
    val firstAquarium = FirstAquarium()
    firstAquarium.buildAquarium()
    println("\n")

    println("Second aquarium WITHOUT ALL features:")
    val secondAquarium = SecondAquarium()
    secondAquarium.buildAquarium()
}