package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.invariance

// In Kotlin, generics are invariant by default.

// In Snippet 1, you're **not using generics, so you **don't encounter this issue.
// The`sharkInfo` function accepts a `WhiteSharks` object,
// and since `DarkSharks`is a subclass of `WhiteSharks`,
// you can pass a `DarkSharks` object to the function.

abstract class Sharks {
    abstract fun isMammal()
    abstract val type: String
    abstract val habitat: String
}

open class WhiteSharks(
    override val type: String = "White Shark",
    override val habitat: String = "Atlantic Ocean"
) : Sharks() {
    override fun isMammal() = println("White Sharks are mammals")

    open fun howToCatchGuidelines() = println("Catch by spear")
}

class DarkSharks(
    override val type: String = "Dark Shark",
    override val habitat: String = "Pacific Ocean"
) : WhiteSharks() {
    override fun isMammal() = println("Dark Sharks are mammals")

    override fun howToCatchGuidelines() = println("Catch by sword")
}

fun sharkInfo(sharkInfo: WhiteSharks) {
    println(sharkInfo.type)
    println(sharkInfo.habitat)
    sharkInfo.howToCatchGuidelines()
}

/*
// snippet 2
// In Snippet 2, you're using generics, but you're
// trying to pass a `CreateShark<DarkSharks> `to a function that expects a`CreateShark<WhiteSharks>`.
// Because of invariance, this is not allowed and results in a type mismatch error.

abstract class Sharks {
    abstract fun isMammal()
    abstract val type: String
    abstract val habitat: String
}

open class WhiteSharks(
    override val type: String = "White Shark",
    override val habitat: String = "Atlantic Ocean"
) : Sharks() {
    override fun isMammal() = println("White Sharks are mammals")

    open fun howToCatchGuidelines() = println("Catch by spear")
}

class DarkSharks(
    override val type: String = "Dark Shark",
    override val habitat: String = "Pacific Ocean"
) : WhiteSharks() {
    override fun isMammal() = println("Dark Sharks are mammals")

    override fun howToCatchGuidelines() = println("Catch by sword")
}

class CreateShark<T : Sharks>(private val genericShark: T) {

    fun creteSharkFunction(): T {
        return genericShark
    }
}

fun sharkInfo(sharkInfo: CreateShark<WhiteSharks>) {
    val shark = sharkInfo.creteSharkFunction()
    println(shark.type)
    println(shark.habitat)
    shark.howToCatchGuidelines()
}

 */

/*
// snippet 3
// In Snippet 3, you're trying
// to pass a `CreateShark<WhiteSharks>` and a `CreateShark<DarkSharks>` to
// a function that expects a`CreateShark<Sharks>`.
// Again, because of invariance, this is not allowed and results in a type mismatch error.

interface Sharks {
    fun isMammal()
    val type: String
    val habitat: String
    fun howToCatchGuidelines()
}

class WhiteSharks(
    override val type: String = "White Shark",
    override val habitat: String = "Atlantic Ocean"
) : Sharks {
    override fun isMammal() = println("White Sharks are mammals")

    override fun howToCatchGuidelines() = println("Catch by spear")
}

class DarkSharks(
    override val type: String = "Dark Shark",
    override val habitat: String = "Pacific Ocean"
) : Sharks {
    override fun isMammal() = println("Dark Sharks are mammals")

    override fun howToCatchGuidelines() = println("Catch by sword")
}

class CreateShark<T : Sharks>(private val genericShark: T) {

    fun creteSharkFunction(): T {
        return genericShark
    }
}

fun sharkInfo(sharkInfo: CreateShark<Sharks>) {
    val shark = sharkInfo.creteSharkFunction()
    println(shark.type)
    println(shark.habitat)
    shark.howToCatchGuidelines()
}

 */
