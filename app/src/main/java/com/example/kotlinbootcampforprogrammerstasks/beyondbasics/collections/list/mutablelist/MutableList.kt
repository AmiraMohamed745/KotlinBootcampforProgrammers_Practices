package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.list.mutablelist

fun main() {
    val fruits = mutableListOf("Apple", "Orange", "Grape", "Mango", "Watermelon")
    fruits.add("Blueberry")
    println(fruits)
    println("\n")

    fruits.removeAt(4)
    println(fruits)
    println("\n")

    fruits.shuffle()
    println(fruits)
    println("\n")

    println(fruits.subList(0, 3))
    println("\n")

    val numbers = mutableListOf(1, 2, 3, 4, 5)
    println(numbers.sum())
    println("\n")

    println(numbers.sumOf { it * 2 })
    println("\n")
}