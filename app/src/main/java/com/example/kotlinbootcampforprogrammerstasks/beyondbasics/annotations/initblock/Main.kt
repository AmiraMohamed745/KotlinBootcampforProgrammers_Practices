package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.annotations.initblock

fun main() {


    val user1 = UserAnnotations(name = "Ali", birthDate = "08-11-2001")
    val user2 = UserAnnotations(name = "Ali", birthDate = "2001-08-01")
    println(user1)
    println(user2)

}