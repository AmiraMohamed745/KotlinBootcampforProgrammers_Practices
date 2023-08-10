package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.projections.inout

fun main() {

    val box = Box<Toy>()

    val toy = Toy("Teddy Bear")

    fillBox(box, toy)

    val retrievedToy = getToy(box)

    println(retrievedToy?.name)

}