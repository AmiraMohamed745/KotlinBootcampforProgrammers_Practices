package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.typeerasure

inline fun <reified A, reified B> Pair<*, *>.asPairOf(): Pair<A, B>? {
    if (first !is A || second !is B) return null
    return first as A to second as B
}

// the as PairOf() function is supposed to return a pair
// of type A and B
// whenever it is called on any pair it checks that the
// first element of type A and the second of type B or not
// we still don't know what type A nad B are
// they are determined at runtime

inline fun <reified T> Any?.useIfTypeOrDefault(defaultValue: T) =
    if (this is T) this else defaultValue

inline fun <reified T> Iterable<*>.filterIsInstance() = filter { it is T }