package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.list.hashcode

class Users(private var name: String, private var age: Int) {

    override fun equals(other: Any?): Boolean =
        other is Users && other.name == name && other.age == age

    override fun hashCode(): Int {
        var result = name.hashCode()
// declare a var result that takes the hashCode()
// of one of the constructor parameters
        result = result * 31 + age.hashCode()
// then re-assign it to take that first parameter
// hashCode multiplied by 31 and added to the
// hashCode of the second parameter
        return result
// then you return the result
    }
}