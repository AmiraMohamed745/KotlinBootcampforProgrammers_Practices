package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.projections.star

fun main() {
    val animal = Animal("Animal")
    val dog = Dog("Dog")
    val wolf = Wolf("Wolf")
    readIn(animal)
    readIn(wolf)
    readIn(dog)
    println("\n")

    readOut(animal)
    readOut(wolf)
    readOut(dog)
    println("\n")

    readStar(animal)// ERROR
    readStar(wolf)
    readStar(dog)

    /*
    // changing the constraints
    val animal = Animal("Animal")
    val dog = Dog("Dog")
    val wolf =  Wolf("Wolf")
    readIn(animal) // ERROR
    readIn(wolf)
    readIn(dog)
    println("\n")

    readOut(animal) // ERROR
    readOut(wolf)
    readOut(dog)
    println("\n")

    readStar(animal) // ERROR
    readStar(wolf)
    readStar(dog)
     */


    // how <*> differs from <Any?>

    val listOfStrings: List<String> = listOf("Hello", "Kotlin", "World")
    acceptAnyList(listOfStrings)
// in the Kotlin standard library,
// List (unlike Array) is using declaration-site
// variance to specify its type parameter as out.
// So when you specify a function parameter
// of List<Any?>, you’re effectively
// getting List<out Any?>, which, as we saw above,
// is one of the three ways to accept all kinds of
// a generic.

    acceptStarList(listOfStrings)


    val arrayOfStrings = arrayOf("Hello", "Kotlin", "World")
//    acceptAnyArray(arrayOfStrings)  // ERROR
// compilation fails here because Array<Any?>
// is not a super type of Array<String>

    acceptStarArray(arrayOfStrings)
// The Array<*> type in Kotlin is a form of type
// projection. It's equivalent to Array<out Any?>,
// which means it's an array of an unknown type,
// but we're only going to read values from it
// (hence the out keyword). This makes it safe
// to pass an array of any type to the function,
// because we're not going to write any values to
// it that could potentially violate its type.

    // mutableList<*>
    val mutableListOfStrings: MutableList<String> = mutableListOf("Amira", "Mohamed", "Ali")
    val mutableListOfMixed = mutableListOf("Amira", 1, 7.5)
    val dog2 = Animals("Dog")
    val wolf2 = Animals("Wolf")
    val mutableListOfObjects = mutableListOf(dog, wolf)

  //  getMutableListAny(mutableListOfStrings)
// ERROR
// Type mismatch.
// Required: MutableList<Any?>
//Found: MutableList<String>
// MutableList is Invariant

    getMutableListStar(mutableListOfStrings, "Ahmed")
    getMutableListStar(mutableListOfMixed, "Ahmed")
    getMutableListStar(mutableListOfObjects, "Ahmed")
// even though you add a value for item
// you CANNOT really add it becaue of the <*>
}