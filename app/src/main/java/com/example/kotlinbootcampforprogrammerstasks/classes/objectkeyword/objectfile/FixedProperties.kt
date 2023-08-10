package com.example.kotlinbootcampforprogrammerstasks.classes.objectkeyword.objectfile

object FixedProperties : FishFood, Habitat {

    override fun eat() {
        println("I will eat little fishes.")
    }

    override fun noEat() {
        println("I will not eat today.")
    }

    override fun getHabitat() {
        println("I live in the ocean.")
    }

}

// instead of declaring the object with the other classes
// you can create a file object which contains all the
// singletons you want
// it can inherit from other classes of interfaces
