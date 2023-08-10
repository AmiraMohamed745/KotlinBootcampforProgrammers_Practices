package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.labeledbreaks

fun main() {

    for (i in 1..6) {
        for (j in 1..4) {
            println("i = $i; j = $j")
            if (i == 3 && j == 2) break
        }
    }


    outerLoop@ for (i in 1..6) {
        for (j in 1..4) {
            println("i = $i; j = $j")
            if (i == 3 && j == 2) break@outerLoop
        }
    }

    outerLoop@ for (i in 1..6) {
        innerLoop@ for (j in 1..4) {
            println("i = $i; j = $j")
            if (i == 3 && j == 2) break@innerLoop
        }
    }

}