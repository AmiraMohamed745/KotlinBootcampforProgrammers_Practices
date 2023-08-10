package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.invariance

fun main(){

    // snippet 1

    val whiteShark = WhiteSharks()
    sharkInfo(whiteShark)

    val darkShark = DarkSharks()
    sharkInfo(darkShark)

 /*
    // snippet 2
    val whiteShark = CreateShark(WhiteSharks())
sharkInfo(whiteShark)

val darkShark = CreateShark(DarkSharks())
sharkInfo(darkShark)

// ERROR: Type mismatch.
//Required:
//CreateShark<WhiteSharks>
//Found:
//CreateShark<DarkSharks>}

  */

    /*
    // snippet 3
     val whiteShark = CreateShark(WhiteSharks())
sharkInfo(whiteShark)
// ERROR :Type mismatch.
// Required:
// CreateShark<Sharks>
// Found:
// CreateShark<WhiteSharks>

val darkShark = CreateShark(DarkSharks())
sharkInfo(darkShark)
// ERROR: Type mismatch.
// Required:
// CreateShark<Sharks>
// Found:
// CreateShark<DarkSharks>
     */
}