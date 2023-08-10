package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.set

fun main(){

    fun createSet(s: Set<Any>) {
        val copyOfSet = LinkedHashSet(s)
        println(copyOfSet)
    }

    createSet(setOf(1, 2, 3, 4, 5))

    // LinkedHashSet<> is a constructor
    // You will have to pass the elements by creating a listOf() or setOf()

    val setOfPets = LinkedHashSet<String>(setOf("dog", "cat", "fish"))
    println(setOfPets)

    // linkedListOf() is a function that creates a LinkedHashSet
   // You can pass the arguments directly without needing to create listOf() or a setOf()

    val setOfFabric = linkedSetOf("Cotton", "Silk", "Wool")
    println(setOfFabric)


}