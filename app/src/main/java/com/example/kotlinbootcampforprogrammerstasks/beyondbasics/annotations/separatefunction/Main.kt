package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.annotations.separatefunction

fun main() {

    val user3 = UserExtensionFunction(name = "Amira", birthDate = "08-11-2001")
// ERROR ↑
    val user4 = UserExtensionFunction(name = "Amira", birthDate = "2001-08-01")
    println(user3)
    println(user4)

    val user5 = UserAnnotationsTwo(name = "Amira", birthDate = "08-11-2001", "AB")
// ERROR ↑
    val user6 = UserAnnotationsTwo(name = "Amira", birthDate = "2001-08-01", "-O")
    println(user5)
    println(user6)

}