package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.list.hashcode

fun main() {

    val user1 = Users("Omar", 30)
    val list1 = listOf<Users>(user1)
    val user2 = Users("Omar", 30)
    val list2 = listOf<Users>(user2)
    println(user1 == user2)
    println(list1 == list2)
}