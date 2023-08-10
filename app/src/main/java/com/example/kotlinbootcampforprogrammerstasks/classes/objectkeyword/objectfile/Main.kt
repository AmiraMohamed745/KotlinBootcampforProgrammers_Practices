package com.example.kotlinbootcampforprogrammerstasks.classes.objectkeyword.objectfile

fun main() {

    fun makeFish(){
        val fish = Fish()
        println("Fish 1: ")
        fish.getFish("Shark")
        fish.getColor("Grey")
        fish.eat()
        fish.getHabitat()
// the objects of the class implemnting the deledgation can
// then access the object members
        println("\n")

        println("Fish 2: ")
        fish.getFish("Whale")
        fish.getColor("Black")
        fish.noEat()
        fish.getHabitat()

    }

    makeFish()
}