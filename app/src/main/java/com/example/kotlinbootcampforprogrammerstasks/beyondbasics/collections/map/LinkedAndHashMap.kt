package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.map

fun main() {

    val studentsGrades = linkedMapOf("Ahmed" to 50, "Amira" to 60, "Leila" to 70)
    println(studentsGrades)
    println("\n")

    val studentsGrades2 = hashMapOf("Ahmed" to 50, "Amira" to 60, "Leila" to 70)
    println(studentsGrades2)
    println("\n")

    val studentsGrades3 = LinkedHashMap<String, Int>()
    studentsGrades3["Ahmed"] = 50
    studentsGrades3["Amira"] = 60
    studentsGrades3["Leila"] = 70
    println(studentsGrades3)
    println("\n")

    val studentsGrades4 = HashMap<String, Int>()
    studentsGrades4["Ahmed"] = 50
    studentsGrades4["Amira"] = 60
    studentsGrades4["Leila"] = 70
    println(studentsGrades4)
    println("\n")

}