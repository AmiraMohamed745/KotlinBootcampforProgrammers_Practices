package com.example.kotlinbootcampforprogrammerstasks.functions.randomday

fun main() {
// create 2 vals to access the functions
    val today = chooseFoodDay()
    val food = feedTheFish(today)
    println("On $today the fish will eat $food.")
}