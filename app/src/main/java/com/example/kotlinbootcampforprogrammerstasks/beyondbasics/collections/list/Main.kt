package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.list


fun main() {

    val bob = People("Bob", 31)
    val people = listOf(People("Adam", 20), bob, bob)
    val people2 = listOf(People("Adam", 20), People("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)

    val maria = People("Maria", 28)
    val nahla = People("Nahla", 32)
    val nada = People("Nada", 19)
    val suzan = People("Suzan", 25)
// create the objects like this ☝🏽
// then use the vals you created instead of declaring
// new objects inside the list using People(name, age)

    val womenEgypt = listOf(maria, nahla)
    val womenLybia = listOf(maria, nada)
    val womenTunis = listOf(maria, nahla)
    val womenTunis2 = listOf(People("Maria", 28), People("Nahla", 32))
    val womenSudan = listOf(nahla, maria)
    val womenJordan = listOf(womenEgypt, suzan)
    val womenSyria = listOf(listOf(maria, nahla), suzan)


    println(womenEgypt == womenTunis) // true
    println(womenEgypt == womenTunis2) // false
    println(womenEgypt == womenSudan) // false
    println(womenEgypt == womenLybia) // false
    println(womenJordan == womenSyria) // true
// be careful that in order for womenJordan == womenSyria
// to return true womenSyria should be declared as
// listOf(listOf(maria, nahla), suzan)
// NOT
// listOf(maria, nahla, suzan)
// maria and nahla should be made into a list as womenEgypt
// which is the first element in womenJordan is actually
// a list of its own

// when to implement equals() case 1
    val user1 = User("mixt1256", "Samy", 25)
    val user2 = User("mixt1256", "Nader", 75)
    println(user1 == user2)




}

