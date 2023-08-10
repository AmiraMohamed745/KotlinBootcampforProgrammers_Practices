package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.labeledbreaks

fun main() {

   // Ending execution of the function itself
   fun foo() {
       listOf(1, 2, 3, 4, 5).forEach {
           if (it == 3) return // non-local return directly to the caller of foo()
           print(it)
       }
       println("this point is unreachable")
   }


    // Ending execution of the lambda expression in one way
    fun foo2() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
            print(it)
        }
        print(" done with explicit label")
    }

    fun useMap() {
        listOf(1, 2, 3, 4, 5).map endMap@{
            if (it == 3) return@endMap 0 // local return to the caller of the lambda - the map function
            it * 2 // doubles the number
        }.forEach { print(it) }
        println(" done with explicit label")
    }
    useMap()

    // Ending execution of the lambda expression in another way
    fun foo3() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
            print(it)
        }
        print(" done with implicit label")
    }

    fun useMap2() {
        listOf(1, 2, 3, 4, 5).map {
            if (it == 3) return@map 0 // local return to the caller of the lambda - the map function
            it * 2 // doubles the number
        }.forEach { print(it) }
        println(" done with implicit label")
    }

    // Ending execution of the anonymous function inside the high-order function
    fun endAnonymousFunction() {
        listOf(1, 2, 3, 4, 5).map(fun(value: Int): Int {
            if (value == 3) return 0  // local return to the caller of the anonymous function - the map function
            return value * 2 // doubles the number
        }).forEach { print(it) }
        print(" done with anonymous function")
    }

    endAnonymousFunction()
}