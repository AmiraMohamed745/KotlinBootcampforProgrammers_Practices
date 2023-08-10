package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.map


fun main() {

    val mapOfPets = mapOf(
        "Dog" to "Hell yeah", "Cat" to "Maybe", "Lizard" to "I will think about it",
        "Spider" to "Hell No"
    )

    println(mapOfPets.plus("Hamster" to "When you're older"))

    println(mapOfPets.minus("Cat"))

    println(mapOfPets.plus("Hamster" to "When you're older").minus("Cat"))

    println(
        mapOfPets.plus("Hamster" to "When you're older").minus("Cat").plus("Bird" to "Cruel, so no")
    )

// chaining the plus and minus functions together for multiple
// modifications can become repetitive and less readable.
// In the scenario you described, where you want to
// add the "Hamster" entry, remove the "Cat" entry,
// and then add another entry like "Bird,"
// the chaining approach can become cumbersome.


// store the result of each operation in a variable
    val newMapOfPetAddHamster = mapOfPets.plus("Hamster" to "When you're older")
    println(newMapOfPetAddHamster)

    val newMapOfPetAddHamsterRemoveCat = newMapOfPetAddHamster.minus("Cat")
    println(newMapOfPetAddHamsterRemoveCat)

    val newMapOfPetAddHamsterRemoveCatAddBird =
        newMapOfPetAddHamsterRemoveCat.plus("Bird" to "Cruel, so no")
    println(newMapOfPetAddHamsterRemoveCatAddBird)



// A map stores key-value pairs; keys are unique,
// but different keys can be paired with equal values.

    val companyPositions =
        mapOf("Marketing Manager" to "Leila Hassan", "Marketing Advocate" to "Leila Hassan")
    println("Marketing manager: ${companyPositions.getValue("Marketing Manager")}")
    println("Marketing advocate: ${companyPositions.getValue("Marketing Advocate")}")



// Can there be SAME keys with DIFFERENT values?
// No, it is not possible to have duplicate keys in a Map.
// If you try to add a new entry with a key that already exists in the Map,
// the value associated with that key will be updated to the new value.

    val employeesPositions =
        mapOf(
            "Leila Hassan" to "Marketing manager",
            "Leila Hassan" to "Janitor"
        )
    println(employeesPositions.getValue("Leila Hassan"))

// The map interface provides specific functions,
// such as access to value by key, searching keys and values, and so on.

    println(mapOfPets["Spider"])
    println("\n")
   // get the value of Spider

    println(mapOfPets.entries)
    println("\n")
    println(mapOfPets.keys)
    println("\n")
    println(mapOfPets.size)
    println("\n")
    println(mapOfPets.values)
    println("\n")
    println(mapOfPets.containsKey("Cat"))
    println("\n")
    println(mapOfPets.getValue("Dog"))
    println("\n")
    println(mapOfPets.contains("Hell No"))
    println("\n")
    println("Can we get a snake: ${mapOfPets.getOrDefault("Snake", "Not in a million years")}")
    println("\n")
   // get the value of the key Snake and in case it does not
   // exist then its value shall be the default you provide
    println(mapOfPets.getOrDefault("Cat", "Not now"))

    // Two maps containing the equal pairs are equal regardless of the pair order.

    val studentGrades = mapOf("Ahmed Mohamed" to 98, "Khaled Hassan" to 82.5, "Nadia Sameh" to 85)
    val studentGrades2 = mapOf("Nadia Sameh" to 85, "Khaled Hassan" to 82.5, "Ahmed Mohamed" to 98)
    println(studentGrades == studentGrades2)
}
