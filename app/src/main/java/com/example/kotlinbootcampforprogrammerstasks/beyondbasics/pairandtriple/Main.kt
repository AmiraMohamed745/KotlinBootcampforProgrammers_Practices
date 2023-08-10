package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.pairandtriple

fun main() {

    val book = Book("Dan Brown", "The Lost Symbol", 2018)
    println(book.getAuthorAndTitle())
    println(book.getAllBookInfo())
    println(
        "Here's your book ${book.getAuthorAndTitle().second} written by" +
                " ${book.getAuthorAndTitle().first} in ${book.getAllBookInfo().third}."
    )
}