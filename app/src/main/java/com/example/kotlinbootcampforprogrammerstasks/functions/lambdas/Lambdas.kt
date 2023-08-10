package com.example.kotlinbootcampforprogrammerstasks.functions.lambdas

// lambda without parameters or return type
val greeting = { println("Hello for now") }

// lambda WITH parameters or return type
val sumOfNumbers = { a: Int, b: Int -> a + b }

// lambda in a high-order function
fun sayWhat(message: () -> Unit) {
    message()
}

// Another example on Passing a lambda as an argument for a high-order function

fun calculateCreditInt(initialCreditInt: Double, operation: (Double) -> Double): String {
    return "Your credit interest for next month is ${operation(initialCreditInt)}"
}

//  Using lambdas ➕ Compact functions as arguments for a function

fun thirdMonthIntIncrease(initialCreditInt: Double): String =
    "You credit interest for the third month is ${initialCreditInt + 1.5}"

// the compact fun is of type String

fun calculateCreditInt2(initialCreditInt: Double, operation: (Double) -> String): String {
    return operation(initialCreditInt)
}

// it: implicit name of a single parameter
fun cleanWater(dirty: Int, operation: (Int) -> Int): String {
    return "The tank dirtiness level is: ${operation(dirty)}"
}
