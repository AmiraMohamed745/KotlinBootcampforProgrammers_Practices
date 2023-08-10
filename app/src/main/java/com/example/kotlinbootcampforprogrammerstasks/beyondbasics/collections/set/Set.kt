package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.set

import java.io.File


fun main() {

// in the below example, every time you iterate over the set,
// the result is the same, does this mean that set
// is actually an ordered collection❓ NO

    val numbers = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers)

// In this example, we have a Set of fruits that
// we want to iterate over and check if "cherry"
// is present. However, because Sets are unordered,
// we can't guarantee that the "cherry" element will be
// processed before any other elements in the Set.

    val set = setOf("apple", "banana", "cherry", "date", "elderberry")

    for (fruit in set) {
        if (fruit == "cherry") {
            println("Found cherry!")
        }
    }

    val isBanana = set.contains("banana")
    println(isBanana)


    val gradeOfEssayCourse = mutableSetOf(38, 32, 30, 24, 27, 28, 15)
// these ☝🏽 are the first grades added

    gradeOfEssayCourse.add(30)
    gradeOfEssayCourse.add(15)
// here we try to add other grades that are the same
// as the ones above as if other students have achieved
// the same grade


//  the duplicates أميرة محمد ➕ ليلي طارق are removed
    println("Third year grades in essay course: $gradeOfEssayCourse")

    println("Set:")
    val setOfNames = mutableSetOf<String>()
    File("G:\\AppDevelopment\\Udacity_Free_Course\\app\\src\\main\\java\\Names").reader()
        .forEachLine { name ->
            setOfNames.add(name)
        }
    setOfNames.forEach { name ->
        println(name)
    }

    //  Storing the result in a list

    println("List:")
    val listOfNames = mutableListOf<String>()
    File("G:\\AppDevelopment\\Udacity_Free_Course\\app\\src\\main\\java\\Names").reader()
        .forEachLine { name ->
            listOfNames.add(name)
        }
    listOfNames.forEach { name ->
        println(name)
    }

    // Two sets are equal if they have the same size

    val numberFrom1to5 = setOf(1, 2, 3, 4, 5)
    val numberFrom1to6 = setOf(1, 2, 3, 4, 6)
    println("Are both sets equal: ${numberFrom1to5 == numberFrom1to6}\n")

    val numberFrom1to5Two = setOf(1, 2, 3, 4, 5)
    val numberFrom1to6Excluding5 = setOf(1, 2, 3, 4, 5, 6)
    println("Are both sets equal: ${numberFrom1to5Two == numberFrom1to6Excluding5}\n")

    val numberFrom1to5Three = setOf(1, 2, 3, 4, 5)
    val numberFrom1to5Reversed = setOf(5, 4, 3, 2, 1)
    println("Are both sets equal: ${numberFrom1to5Three == numberFrom1to5Reversed}\n")

    val numberFrom1to5List = listOf(1, 2, 3, 4, 5)
    val numberFrom1to5ReversedList = listOf(5, 4, 3, 2, 1)
    println("Are both lists equal: ${numberFrom1to5List == numberFrom1to5ReversedList}\n")

    val numberFrom1to5ListTwo = listOf(1, 2, 3, 4, 5)
    val numberFrom1to5ReversedListTwo = listOf(1, 2, 3, 4, 5)
    println("Are both lists equal: ${numberFrom1to5ListTwo == numberFrom1to5ReversedListTwo}")

}
