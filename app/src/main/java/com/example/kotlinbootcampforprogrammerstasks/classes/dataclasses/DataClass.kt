package com.example.kotlinbootcampforprogrammerstasks.classes.dataclasses

data class EGBANK(
    val branch: String,
    val address: String,
    val openingHours: String,
// the primary constructor only has 3 parameters

) {
    var services: List<String> = listOf("")
    var funds: String = ""
    var capital: Int = 0
// the rest of the properties are declared in teh class body
// meaning they WILL NOT get the auto-generated functions
// a data class has like equals()

    init {
        println("Branch: $branch")
        println("Address: $address")
        println("Opening hours: $openingHours")

    }
}