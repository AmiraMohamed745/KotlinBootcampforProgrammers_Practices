package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.projections.star

// initial constraints
interface Group<T : Animal> {
    fun insert(item: T): Unit
    fun fetch(): T
}

open class Animal(val name: String) : Group<Animal> {

    override fun insert(item: Animal) {
        println(item.name)
    }

    override fun fetch(): Animal {
        return Animal(name)
    }
}

open class Dog(name: String) : Animal(name)


class Wolf(name: String) : Dog(name)

fun readIn(group: Group<in Nothing>) {
    // to accept any kind
    // Inferred type of `item` is `Any?`
    val itemFetch = group.fetch()
    println(itemFetch) // type: Any?
    // we CANNOT invoke all of Animal’s functions and properties on item.

}

fun readOut(group: Group<out Animal>) {
// to return any kind
// can't use Any? as we use the
// upper bound of Animal in Group<T: Animal>
// Inferred type of `item` is `Animal`
    val itemFetch = group.fetch()
    println(itemFetch.name) // type: Animal
    // we can invoke all of Animal’s functions and properties on item.
}

fun readStar(group: Group<*>) {
    // Inferred type of `item` is `Animal`
    val itemFetch = group.fetch()
    println(itemFetch.name)
}

/*
// changing the constraints
interface Group<T : Dog> {
    fun insert(item: T): Unit
    fun fetch(): T
}

open class Animal(val name: String)

open class Dog(val name: String) : Group<Dog> {

    override fun insert(item: Dog) {
        println(item.name)
    }

    override fun fetch(): Dog {
        return Dog(name)
    }
}


class Wolf(name: String) : Dog(name)

fun readIn(group: Group<in Nothing>) {
    // to accept any kind
    // Inferred type of `item` is `Any?`
    val itemFetch = group.fetch()
    println(itemFetch) // type: Any?
    // we CANNOT invoke all of Dog’s functions and properties on item.

}

fun readOut(group: Group<out Dog>) {
// to return any kind // can't use Any? as we use the
// upper bound of Dog in Group<T: Dog>
    // Inferred type of `item` is `Dog`
    val itemFetch = group.fetch()
    println(itemFetch.name) // type: Dog
    // we can invoke all of Dog’s functions and properties on item.
}

fun readStar(group: Group<*>) {
    // Inferred type of `item` is `Dog`
    val itemFetch = group.fetch()
    println(itemFetch.name)
}

 */

// how <*> differs from <Any?>
fun acceptAnyList(list: List<Any?>) {
    println(list)
}
fun acceptStarList(list: List<*>) {
    println(list)
}

fun acceptAnyArray(array: Array<Any?>) {
    println(array)
}

fun acceptStarArray(array: Array<*>) {
    println(array)
}

// mutableList<*>

class Animals(val name: String)

fun getMutableListAny(mutableList: MutableList<Any?>, item: Any?) {
    println(mutableList)
    mutableList.add(item) // allows addition
}

fun getMutableListStar(mutableList: MutableList<*>, item: Any?) {
    println(mutableList)
    // mutableList.add(item) // ERROR
    // <*> does NOT allow to add anything
    println(mutableList[1])
}

// Star projection is no producer, no consumer ofT

interface Fruit {
    val name: String
    val color: String
    fun getFruitColor(): String
    fun getVitaminC(): String
}

class Apple : Fruit {
    override val name: String = "Apple"
    override val color: String = "Red"
    override fun getFruitColor(): String = "$name is $color "
    override fun getVitaminC(): String = "$name has no vitamin C"
}

open class Orange : Fruit {
    override val name: String = "Orange"
    override val color: String = "Orange"
    override fun getFruitColor(): String = "$name is $color "
    override fun getVitaminC(): String = "$name has vitamin C"
}

class MandarinOrange : Orange() {
    override val name: String = "Mandarin Orange"
    override val color: String = "Orange"
    override fun getFruitColor(): String = "$name is $color "
    override fun getVitaminC(): String = "$name has vitamin C"
}

class ProducerCrate<out T : Fruit>(val fruit: T) {
    private val fruits = listOf<T>()
    fun produce(): T = fruits.last()
}

class Crate<T> {
    private val items = mutableListOf<T>()
    fun produce(): T = items.last()
    fun consume(item: T) = items.add(item)
    fun size(): Int = items.size
}

fun useAsStar(star: Crate<*>) {

    // T is unknown, so the star produces the default supertype Any?.
    val fruit = star.produce()    // Not useful, Type → val fruit: Any?

    // T is unknown, cannot access its properties and functions.
 //   fruit.getColor()                   // Error

    // Cannot consume because you don't know the type of Crate.
 //   star.consume(Apple())                    // Error

    // Only use the T-independent functions and properties.
    star.size()                              // OK
}