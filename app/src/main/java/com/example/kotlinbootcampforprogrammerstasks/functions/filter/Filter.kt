package com.example.kotlinbootcampforprogrammerstasks.functions.filter

import kotlin.system.measureNanoTime

fun main() {

    val decorations = listOf(
        "Rock", "Pagoda",
        "Plastic plant", "Alligator",
        "Flowerpot"
    )

    val filteredListDecorations = decorations.filter { it[0] == 'P' }
    println("\n $filteredListDecorations")
    val time = measureNanoTime { decorations.filter { it[0] == 'P' } }
    println("\n It take $time ns")

    val filteredSequenceDecorations = decorations.asSequence().filter { it[0] == 'P' }
    println("\n ${filteredSequenceDecorations.toList()}")
    val time2 = measureNanoTime { decorations.asSequence().filter { it[0] == 'P' } }
    println("\n It take $time2 ns")
}