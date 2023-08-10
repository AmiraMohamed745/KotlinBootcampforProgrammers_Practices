package com.example.kotlinbootcampforprogrammerstasks.classes.objectkeyword.multipleobjects

fun main() {

    fun makeFish() {
        val fish = Fish()
        fish.getFish("Shark")
        fish.getColor("Grey")
        println(fish.food)
    }

    makeFish()

}