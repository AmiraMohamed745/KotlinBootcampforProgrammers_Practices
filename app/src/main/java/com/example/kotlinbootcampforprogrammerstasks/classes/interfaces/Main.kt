package com.example.kotlinbootcampforprogrammerstasks.classes.interfaces

fun main() {

    val aquarium = AquariumBasedInterface()
    println("Volume: ${aquarium.getVolume()}")
    println("Bubbles based on volume:")
    println(aquarium.fillBubbles(2400))
    println("Bubbles based on fish and plants:")
    println(aquarium.fillBubbles(20, 10))

    fun makeFish() {
        val sharks = Sharks()
        val whales = Whales()

        sharks.eat()
        sharks.migrate()
        whales.eat()
        whales.migrate()

    }

// 1- you create a makeFish function to create the objects

// 2- you use the objects to directly access the interface
// inherited func directly

    makeFish()
// THEN you can the makeFish fun

    fun makeFish2() {
        val sharks = Sharks()
        val whales = Whales()

        feedFish(sharks)
        migrateFish(sharks)
        feedFish(whales)
        migrateFish(whales)

// passing objects as parameters

    }

    makeFish2()
// calling makeFish() func

}