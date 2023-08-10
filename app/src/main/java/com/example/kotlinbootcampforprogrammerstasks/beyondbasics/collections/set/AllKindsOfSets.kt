package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.set

fun main() {

    val setOfColors = hashSetOf("Red", "Green", "Blue")
    println(setOfColors)
// mutable set which does not rely on insertion order (function)
    println("\n")

    val setOfColors2 = HashSet<String>(listOf("Red", "Green", "Blue"))
    println(setOfColors2)
// mutable set which does not rely on insertion order (constructor)
    println("\n")

    val setOfFabric2 = linkedSetOf("Cotton", "Silk", "Wool")
    println(setOfFabric2)
// mutable set which relies on insertion order (function)
    println("\n")

    val setOfNames = setOf("John", "Mary", "Peter")
    println(setOfNames)
// immutable set
    println("\n")

    val setOfPlanets = mutableSetOf("Earth",  "Mars", "Venus")
    println(setOfPlanets)
// mutable set that has LinkedHashSet as its default implementation
    println("\n")

    val setOfJuice = LinkedHashSet<String>(listOf("Apple juice", "Orange juice", "Banana juice"))
    println(setOfJuice)
    setOfJuice.add("Coconut juice")
    println(setOfJuice)
    println("\n")

    val setOfJuice2 = HashSet<String>(listOf("Apple juice", "Orange juice", "Banana juice"))
    println(setOfJuice2)
    setOfJuice2.add("Coconut juice")
    println(setOfJuice2)
    println("\n")

}