package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.list

class People(var name: String, var age: Int)

// when to implement equals() by yourself case 1
class User (private var id: String, private var name: String, private var age: Int ){

    override fun equals(other: Any?): Boolean =
        other is User && other.id == id
}


