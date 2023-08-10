package com.example.kotlinbootcampforprogrammerstasks.functions.compactfuncstions

import kotlin.random.Random



fun feedTheFish() {
    val today = chooseDay()
    val food = chooseFood(today)
    val changeWater = shouldChangeWater(today, 25, 29)
    println("On $today the fish will eat $food.")
    println("Water status: $changeWater")

}

fun chooseDay(): String {
    val allDays = listOf(
        "Saturday", "Sunday", "Monday",
        "Tuesday", "Wednesday", "Thursday", "Friday"
    )
    return allDays[Random.nextInt(7)]
}

fun chooseFood(day: String): String {
    return when (day) {
        "Saturday" -> "Pellets"
        "Sunday" -> "Flakes"
        "Monday" -> "Red-worms"
        "Tuesday" -> "Granules"
        "Friday" -> "Mosquito"
        else -> "Nothing"
    }
}


fun shouldChangeWater(day: String = chooseDay(), temperature: Int = 22, dirty: Int = 20): String {
    return when {
        isTooHot(temperature) -> "Change the water on $day"
        isDirty(dirty) -> "Change the water on $day"
        else -> "The water is just fine!"
    }
}

fun isTooHot(temperature: Int = 22) = temperature > 30
fun isDirty(dirty: Int = 20) = dirty > 30