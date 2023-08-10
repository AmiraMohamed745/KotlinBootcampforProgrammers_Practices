package com.example.kotlinbootcampforprogrammerstasks.functions.lambdas

fun main() {

    val numbers = listOf(1, 5, 15, 3, 8, 6)
    var sum = 0
    numbers.filter { it < 10 }.forEach {
        sum += it
    }
    println(sum)

    greeting()

    println(sumOfNumbers(10, 15))

    println(sayWhat { println("Hello from Amira") })

// Another example on Passing a lambda as an argument for a high-order function
    println(calculateCreditInt(1.5) { newCreditInt: Double -> newCreditInt + 0.5 })

//  Using lambdas ➕ Compact functions as arguments for a function
    println(calculateCreditInt2(1.5)
    { initialCreditInt: Double -> "You credit interest for the second month is ${initialCreditInt + 0.5}" })
    // the lambda-fun is of type String
    println(calculateCreditInt2(1.5, ::thirdMonthIntIncrease))

// it: implicit name of a single parameter
    println(cleanWater(40) { it / 2 })


}