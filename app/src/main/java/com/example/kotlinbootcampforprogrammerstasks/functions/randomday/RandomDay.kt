package com.example.kotlinbootcampforprogrammerstasks.functions.randomday

import kotlin.random.Random

// create a function that sets the day
fun chooseFoodDay(): String {
    val allDays = listOf(
        "Saturday", "Sunday", "Monday",
        "Tuesday", "Wednesday", "Thursday", "Friday"
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