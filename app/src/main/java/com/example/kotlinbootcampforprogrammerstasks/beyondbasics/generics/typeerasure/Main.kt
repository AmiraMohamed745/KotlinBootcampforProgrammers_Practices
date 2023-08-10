package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.typeerasure

fun main() {

    val somePair: Pair<Any?, Any?> = "items" to listOf(1, 2, 3)
// create a pair of type Any and Any which is

    val stringToSomething = somePair.asPairOf<String, Any>()
// check that pair against the types <String, Any>

    val stringToInt = somePair.asPairOf<String, Int>()
// check that pair against the types <String, Int>

    val stringToList = somePair.asPairOf<String, List<*>>()
// check that pair against the types <String, list of any type>

    val stringToStringList = somePair.asPairOf<String, List<String>>()
    // Compiles but breaks type safety!


    val map = mapOf("foo" to listOf("cheese"), "bar" to 666)
    println(map["foo"].useIfTypeOrDefault<List<String>>(emptyList()).firstOrNull())
    println(map["bar"].useIfTypeOrDefault<List<String>>(emptyList()).firstOrNull())

    println(map["foo"].useIfTypeOrDefault<Number>(-1))
    println(map["bar"].useIfTypeOrDefault<Number>(-1))

    val set = setOf("1984", 2, 3, "Brave new world", 11)
    println(set.filterIsInstance<Int>())
    println(set.filterIsInstance<String>())

}