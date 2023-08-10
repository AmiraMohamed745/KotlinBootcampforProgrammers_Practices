package com.example.kotlinbootcampforprogrammerstasks.classes.inheritance

fun main() {

    val aquarium = Aquarium(20, 20, 40)
    print("\n")
    println("Aquarium volume: ${aquarium.volume}\n")
    aquarium.fish = "You can add up to 20 fishes."
    println("Aquarium fish: ${aquarium.fish}\n")

    println("Secondary Aquarium:\n")
    val secondAquarium = SecondAquarium(15, 30, 45)
    print("\n")
    println("Aquarium volume: ${secondAquarium.volume}\n")
    secondAquarium.fish = "You can add up to 50 fishes."
    println("Aquarium fish: ${secondAquarium.fish}")
}
