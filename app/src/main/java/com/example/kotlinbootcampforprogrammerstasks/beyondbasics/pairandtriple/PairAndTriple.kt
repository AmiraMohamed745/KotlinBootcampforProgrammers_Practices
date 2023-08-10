package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.pairandtriple

class Book(private var author: String, private var title: String, private var year: Int) {

    fun getAuthorAndTitle(): Pair<String, String> {
        return Pair(author, title)
    }

    fun getAllBookInfo(): Triple<String, String, Int> {
        return Triple(author, title, year)
    }
}
