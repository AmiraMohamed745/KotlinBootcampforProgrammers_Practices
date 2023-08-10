package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.set

fun main() {

    val gradesFirstYear = mutableSetOf(99.2, 85.7, 75.8, 92.0)
    gradesFirstYear.add(87.5)
    println("Add: $gradesFirstYear\n")
    gradesFirstYear.addAll(setOf(88.0, 56.9, 45.0))
    println("Add all: $gradesFirstYear\n")
    gradesFirstYear.removeIf { it <= 65.0 }
    println("Remove if: $gradesFirstYear\n")
    gradesFirstYear.remove(75.8)
    println("Remove: $gradesFirstYear\n")

}