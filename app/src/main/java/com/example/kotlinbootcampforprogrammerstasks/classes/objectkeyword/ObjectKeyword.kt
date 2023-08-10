package com.example.kotlinbootcampforprogrammerstasks.classes.objectkeyword

class Fish (fishFood : FishFood = FishFoodImplemented1) : FishType by FishTypeImplemented(),
    FishColor by FishColorImplemented(),
    FishFood by fishFood
// you either pass the object as a parameter for the class
// that take the delegation
// OR
// use it immediately like this FishFood by FishFoodImplemented1

interface FishType {
    fun getFish(fish: String)
}

interface FishColor {
    fun getColor(color: String)
}

interface FishFood {
    val food : String
}

// Create 3 interfaces

class FishTypeImplemented : FishType {
    override fun getFish(fish: String) {
        println("I am a $fish.")
    }
}

class FishColorImplemented : FishColor {
    override fun getColor(color: String) {
        println("I am of color $color.")
    }
}

object FishFoodImplemented1 : FishFood {
    override val food: String = "I will eat little fishes."
}

// create 3 classes to implement them

// the reason why we use object because the food
// will not change no matter which fish you pass in
// this means you only need one object and that's why
// we don't use a class because a class provides many objs


