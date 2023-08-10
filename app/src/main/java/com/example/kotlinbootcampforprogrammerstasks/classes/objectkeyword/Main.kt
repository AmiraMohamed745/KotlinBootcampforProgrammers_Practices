package com.example.kotlinbootcampforprogrammerstasks.classes.objectkeyword

fun main() {

    fun makeFish() {
        val fish = Fish()
        fish.getFish("Shark")
        fish.getColor("Grey")
        println(fish.food)
    }

    makeFish()



}