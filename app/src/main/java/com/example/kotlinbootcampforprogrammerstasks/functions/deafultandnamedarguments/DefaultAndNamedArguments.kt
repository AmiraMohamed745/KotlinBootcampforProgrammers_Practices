package com.example.kotlinbootcampforprogrammerstasks.functions.deafultandnamedarguments

import kotlin.random.Random

fun getFoodAndDay(fishes: Int, size: Double = 36.5, status: String = "clean") {
    // create 2 vals to access the functions
    val today = chooseFoodDay()
    val food = feedTheFish(today)
    println("On $today the fish will eat $food.")
    println("\nThe tank size is $size, it's a $status tank with $fishes fishes.")
}


// create a function that sets the day
fun chooseFoodDay(): String {
    val allDays = listOf(
        "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
    )
    return allDays[Random.nextInt(7)]
}

// create a function that sets the food
fun feedTheFish(day: String): String {
    return when (day) {
        "Saturday" -> "Pellets"
        "Sunday" -> "Flakes"
        "Monday" -> "Red-worms"
        "Tuesday" -> "Granules"
        "Friday" -> "Mosquito"
        else -> "Nothing"
    }
}
