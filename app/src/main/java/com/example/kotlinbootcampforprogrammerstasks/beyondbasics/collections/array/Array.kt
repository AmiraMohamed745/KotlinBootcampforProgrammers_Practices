package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.array

import kotlin.system.measureTimeMillis

fun main(){
    val numbersList = listOf(1, 2, 3, 4, 5)
    println("List: $numbersList")

    val numbersArray = arrayOf(1, 2, 3, 4, 5)
    println("Array: ${numbersArray[0]}")
    numbersArray[0] = 7
    println("Array changed: ${numbersArray[0]}")

    val numbersMutableList = mutableListOf(1, 2, 3, 4, 5)
    println("List Size: ${numbersMutableList.size}")
    numbersMutableList.add(5, 6)
    println("ListChanged Size: ${numbersMutableList.size}")

    val numbersArray2 = arrayOf(1, 2, 3, 4, 5)
    println("Array Size: ${numbersArray2.size}")
    numbersArray2[5] = 6
    println("ArrayChanged Size: ${numbersArray2.size}")
// these last 2 line are UNACCEPTABLE because an array
// does not allow the change of its size, hence, you
// CANNOT add new elements


    /*
    // Copying an array to change its size and add to it, which creates a new array
    val numbersArray = intArrayOf(1, 2, 3, 4, 5)
    println("Array Size: ${numbersArray.size}")

val numbersArrayCopied = numbersArray.plus(intArrayOf(6, 7, 8, 9, 10))
// by copying the first array then adding 5 elements
// you make the size of the new array 10

// 📍❗ NOTICE: you can simply use the operator +
// val numbersArrayCopied = numbersArray + intArrayOf(6, 7, 8, 9, 10)
    println("Copied Array Size: ${numbersArrayCopied.size}")
    println("Copies array elements: ${numbersArrayCopied.contentToString()}")
     */

    /*
    val numbersArray = intArrayOf(1, 2, 3, 4, 5)
    println("Array Size: ${numbersArray.size}")

    val numbersArrayCopied = numbersArray.copyOf(10).plus(intArrayOf(6, 7, 8, 9, 10))
    println("Copied Array Size: ${numbersArrayCopied.size}")
    println("Copies array elements: ${numbersArrayCopied.contentToString()}")
     */

    /*
    // To simply copy an array
    val numbersArray = arrayOf(1, 2, 3, 4, 5)
    println("Array Size: ${numbersArray.size}")

    val numbersArrayCopied = numbersArray.copyOf()
    println("Copied Array Size: ${numbersArrayCopied.size}")
     */

    /*
    // To copy with an new size
    val numbersArray = arrayOf(1, 2, 3, 4, 5)
    println("Array Size: ${numbersArray.size}")

    val numbersArrayCopied = numbersArray.copyOf(10)
    println("Copied Array Size: ${numbersArrayCopied.size}")
// we copied the numbersArray and changed its size
// to 10 then called the elements
    println("Copies array elements: ${numbersArrayCopied.contentToString()}")
     */

    /*
    val differentThingsList = listOf(1, "Apple", 25.15, 'b')
    println("List: $differentThingsList")
    val differentThingsArray = arrayOf(1, "Apple", 25.15, 'b')
    println("Array: ${differentThingsArray.contentToString()}")
     */

    val executionTime = measureTimeMillis {
        val differentThingsList = listOf(1, "Apple", 25.15, 'b')
        println("List: $differentThingsList")
    }

    println("The operation took $executionTime milliseconds to execute")


    val executionTime2 = measureTimeMillis {
       val differentThingsArray = arrayOf(1, "Apple", 25.15, 'b')
        println("Array: ${differentThingsArray.contentToString()}")
    }
    println("The operation took $executionTime2 milliseconds to execute")


    val executionTime3 = measureTimeMillis {
        val differentThingsList = listOf(1, "Apple", 25.15, 'b')
        println("List: ${differentThingsList[0]}")
        println("List: ${differentThingsList[1]}")
        println("List: ${differentThingsList[2]}")
        println("List: ${differentThingsList[3]}")
}
    println("The operation took $executionTime3 milliseconds to execute")

    val executionTime4 = measureTimeMillis {
        val differentThingsArray = arrayOf(1, "Apple", 25.15, 'b')
        println("Array: ${differentThingsArray[0]}")
        println("Array: ${differentThingsArray[1]}")
        println("Array: ${differentThingsArray[2]}")
        println("Array: ${differentThingsArray[3]}")
    }
    println("The operation took $executionTime4 milliseconds to execute")

}