package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.coandcontravariance

// an interface that is used to PRODUCE using out
interface Production<out T> {
    fun produce(): T
    // function produce that returns T
}

// an interface that is used to CONSUME using in
interface Consumer<in T> {
    fun consume(item: T)
    // function consume that takes in T
}


// class Food
open class Food

// class FastFood that inherits from Food
open class FastFood : Food()

// class Burger that inherits from FastFood
class Burger : FastFood()



// class FoodStore that implements  the interface Production<out T> and takes
// Food as its type
class FoodStore : Production<Food> {
    // override the function produce to return the type passed inside Production<out T>
    // which is Food
    override fun produce(): Food {
        println("Produce food")
        return Food()
    }
}

// class FastFoodStore that implements  the interface Production<out T> and takes
// FastFood as its type
class FastFoodStore : Production<FastFood> {

    // override the function produce to return the type passed inside Production<out T>
    // which is FastFood
    override fun produce(): FastFood {
        println("Produce fast food")
        return FastFood()
    }
}

// class BurgerStore that implements  the interface Production<out T> and takes
// Burger as its type
class InOutBurger : Production<Burger> {

    // override the function produce to return the type passed inside Production<out T>
    // which is Burger
    override fun produce(): Burger {
        println("Produce burger")
        return Burger()
    }
}


class Everybody : Consumer<Food> {
    override fun consume(item: Food) {
        println("Eat food")
    }
}

class ModernPeople : Consumer<FastFood> {
    override fun consume(item: FastFood) {
        println("Eat fast food")
    }
}

class American : Consumer<Burger> {
    override fun consume(item: Burger) {
        println("Eat burger")
    }
}