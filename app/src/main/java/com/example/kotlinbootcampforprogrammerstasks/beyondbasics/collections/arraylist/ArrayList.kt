package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.arraylist

import java.util.LinkedList
import kotlin.system.measureTimeMillis

fun main() {

    // Functions to call on an ArrayList

    val arrayList = ArrayList<Int>()
    arrayList.add(5)
    println("Add: $arrayList\n")

    arrayList.addAll(listOf(1, 2, 3))
    println("Add all: $arrayList\n")

    println("Get: ${arrayList[2]}\n")

    arrayList[0] = 10
    println("Set1: $arrayList\n")

    println("Set2: ${arrayList.set(1, 15)}\n")

    println("Index of, present: ${arrayList.indexOf(3)}\n")

    println("Index of, not present: ${arrayList.indexOf(25)}\n")

    arrayList.remove(2)
    println("Remove: $arrayList\n")

    arrayList.clear()
    println("Clear: $arrayList\n")

    val arrayList2 = ArrayList<Int>(listOf(30, 40, 50))
    println("Array 2: $arrayList2\n")

    val arrayList3 = arrayListOf(100, 200, 300)
    println(arrayList3::class.simpleName)
    println("Array 3: $arrayList3\n")

    // Get the different occurrences of the same element

    val arrayListDuplicates =
        ArrayList<Double>(listOf(98.0, 67.5, 98.0, 77.0, 92.3, 76.5, 98.0, 100.0))
    val firstOccurrence = arrayListDuplicates.indexOf(98.0) // gets an index
    var secondOccurrence = -1
    var thirdOccurrence = -1

    for (index in firstOccurrence + 1 until arrayListDuplicates.size - 1) {
        if (arrayListDuplicates[index] == 98.0) { // comparison
            secondOccurrence = index // assignment
            break
        }
    }

    for (index in secondOccurrence + 1 until arrayListDuplicates.size - 1) {
        if (arrayListDuplicates[index] == 98.0) {
            thirdOccurrence = index
            break
        }
    }

    println("1st: $firstOccurrence\n")
    println("2nd: $secondOccurrence\n")
    println("3rd: $thirdOccurrence\n")

    // A use case that shows that LinkedList is faster than ArrayList which is an exception

    val executionTimeArray = measureTimeMillis {
        val arrayList = ArrayList<Int>(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
        println(arrayList[3])
        println(arrayList[8])
        println(arrayList[0])
        println(arrayList[6])
        println(arrayList[1])
        println(arrayList[9])
        println(arrayList[4])
        println(arrayList[7])
        println(arrayList[5])
    }

    println("Array list time: $executionTimeArray\n")

    val executionTimeLinked = measureTimeMillis {
        val linkedList = LinkedList(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
        println(linkedList[3])
        println(linkedList[8])
        println(linkedList[0])
        println(linkedList[6])
        println(linkedList[1])
        println(linkedList[9])
        println(linkedList[4])
        println(linkedList[7])
        println(linkedList[5])
    }

    println("Linked list time: $executionTimeLinked")

// the array list is taking more time
// In the ArrayList, the elements are accessed in
// a scattered manner. This is because the elements are
// not being accessed sequentially, but instead in a random
// order. Accessing elements in a scattered manner is less
// favorable for an ArrayList because the elements are
// stored in contiguous memory locations and accessing
// scattered elements may result in cache misses,
// which can slow down performance.

}