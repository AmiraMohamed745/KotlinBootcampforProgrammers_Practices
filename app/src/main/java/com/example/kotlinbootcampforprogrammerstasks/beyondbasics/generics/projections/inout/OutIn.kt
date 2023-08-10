package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.projections.inout

class Toy(val name: String)


class Box<T>(var content: T? = null) {
    fun add(item: T) {
        content = item
    }

    fun get(): T? = content
}


fun fillBox(box: Box<in Toy>, toy: Toy) {
    box.add(toy)
}
// in type-projection at the point where
// class Box is used

// out type-projection at the point where
// class Box is used
fun getToy(box: Box<out Toy>): Toy? {
    return box.get()
}

// out projection is a producer ofT
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

fun useAsProducer(producer: Crate<out Fruit>) {

    // T is known to be out Fruit, so produces Fruit and its subtypes.
    val fruit = producer.produce() // OK, Type → val fruit: Fruit

    // Fruit is guaranteed. Can use functions and properties of Fruit.
 //   fruit.getColor()                         // OK

    // Consumer not allowed because you don't want to accidentally add
    // oranges, if this is a Crate<Apple>
    // Type mismatch.
    //Required: Nothing
    //Found: Orange
//    producer.consume(Orange())               // Error
}

// in projection is a consumer of T

class Crate2<T> {
    private val items = mutableListOf<T>()
    fun produce(): T = items.last()
    fun consume(item: T) = items.add(item)
    fun size(): Int = items.size
}

fun useAsConsumer(consumer: Crate2<in Orange>) {

    // Produces Any?, no guarantee of Orange because this could
    // be a Crate<Fruit> with apples in it.
    val fruit = consumer.produce() // Not useful, Type: val fruit: Any?

    // Not safe to call functions of Orange on the produced items.
    //   fruit.getVitaminC()   // Error

    // T is known to be in Orange, so consumes Orange and its subtypes.
    //   consumer.consume(MandarinOrange())       // OK
}