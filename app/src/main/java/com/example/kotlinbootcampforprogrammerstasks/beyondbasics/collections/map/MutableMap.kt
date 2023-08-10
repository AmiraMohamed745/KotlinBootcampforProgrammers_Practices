package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.map

fun main() {

    val employeesPayroll = mutableMapOf(4500 to listOf("Nadia Khaled", "Khaled Hassan"),
        6700 to listOf("Ahmed Mohamed", "Sami Nadir"))

//    employeesPayroll.put(8000 to listOf("Suzy Amr", "Samar Nadir"))
// this ☝🏽 give an error

// the RIGHT WAY to use put()
    employeesPayroll.put(8000, listOf("Suzy Amr", "Samar Nadir"))

// OR
    employeesPayroll[8000] = listOf("Suzy Amr", "Samar Nadir")



// When using put and remove on a mutable map,
// they modify the original map rather than creating a new map

    val employeesPayroll2 = mutableMapOf(4500 to listOf("Nadia Khaled", "Khaled Hassan"),
        6700 to listOf("Ahmed Mohamed", "Sami Nadir"))

    employeesPayroll2[8000] = listOf("Suzy Amr", "Samar Nadir")
    employeesPayroll2[4500] = listOf("Nadia Khaled", "Khaled Hassan", "Suzy Amr")
    employeesPayroll2[8000] = listOf("Samar Nadir")
    employeesPayroll2.remove(6700)
    println(employeesPayroll2)

    employeesPayroll2[8000] = listOf("Suzy Amr", "Samar Nadir")
    println(employeesPayroll2)
    employeesPayroll2[4500] = listOf("Nadia Khaled", "Khaled Hassan", "Suzy Amr")
    println(employeesPayroll2)
    employeesPayroll2[8000] = listOf("Samar Nadir")
    println(employeesPayroll2)
    employeesPayroll2.remove(6700)
    println(employeesPayroll2)


}