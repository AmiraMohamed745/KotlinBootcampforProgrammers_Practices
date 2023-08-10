package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.coandcontravariance

fun main() {
    val production1: Production<Food> = FoodStore()
    val production2: Production<Food> = FastFoodStore()
    val production3: Production<Food> = InOutBurger()
// Production<Food> is a supertype that allows
// its subtypes (FastFood + Burger) to be placed instead
// of it
    production1.produce()
    production2.produce()
    production3.produce()
    println("\n")

// Consumer<Burger> is a subtype that allows its supertypes
// to be placed instead of it
    val consumer1: Consumer<Burger> = Everybody()
    val consumer2: Consumer<Burger> = ModernPeople()
    val consumer3: Consumer<Burger> = American()

    consumer1.consume(Burger())
    consumer2.consume(Burger())
    consumer3.consume(Burger())
}