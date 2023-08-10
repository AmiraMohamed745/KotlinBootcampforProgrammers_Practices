package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.list.equals

// when to implement equals() case 2
fun main() {
    println("Normal class equality check:")
    val maria = People("Maria", 28)
    maria.id = "airam1235"
    val maria2 = People("Maria", 28)
    maria2.id = "airam1235896"
    println(maria == maria2)
    println("\n")

    println("Data class equality check:")
    val mariaData = People2("Maria", 28)
    mariaData.id = "airam1235"
    val mariaData2 = People2("Maria", 28)
    mariaData2.id = "airam12378"
    println(mariaData == mariaData2)
}