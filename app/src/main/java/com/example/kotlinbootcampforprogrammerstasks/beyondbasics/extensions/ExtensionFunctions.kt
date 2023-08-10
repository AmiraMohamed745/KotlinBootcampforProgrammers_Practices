package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.extensions

open class Shape
class Rectangle : Shape()

fun Shape.getName() = "Shape"
fun Shape.getNumbers() = 1

fun Rectangle.getName() = "Rectangle"
fun Rectangle.getNumbers() = 2

// both the Shape and Rectangle class have the same extension
// functions

fun printClassInfo(s: Shape) {
    println("Name: ${s.getName()}")
    println("Numbers: ${s.getNumbers()}")
}

// creating a function that calls both the extension functions
// on the expression based inside the function parameter
// which is of type Shape

fun Parent.getJobs(job: String) {
    println("Job is $job in extension")
}

class Parent {
    fun getJobs(job: String) {
        println("Job is $job in member")
    }
}

fun Child.getSchool(school: String, address: String) {
    println("School is $school in extension, it is located in $address")
}

class Child {
    fun getSchool(school: String) {
        println("School is $school in member")
    }
}


// with an interface

fun AnimalInfo.getName() {
    println("Name: ")
    name = readLine()!!.toString()
    println("Name is $name")
}

// In order to declare the getName() fun as an extension function
// you have to access something in th receiver parameter
// which means that instead of declaring the name variable inside
// the getName() function *as show in the pic below👇🏽* you
// should add it as a property to the interface
// which you will later have to override in all the classses that
// implement the interface


fun AnimalInfo.getGeneralInfo() {
    getName()
    getAge()
    getWeight()
    getBreed()
}
// using an extension function here helps you to get all the
// info you want and have declared inside the interface by
// calling ONE function, which will make the code more readable

interface AnimalInfo {
    var name: String

    // defining name variable
    fun getAge()
    fun getWeight()
    fun getBreed()
}

class AnimalInfoImpl : AnimalInfo {

    override var name: String = ""
// overriding the name variable to an empty string

// the IDE will suggest that you make the classes that implement
// the interface abstract classes. DO NOT DO THIS
//Making both AnimalInfoImpl and DogInfoImpl abstract classes
// might not be the best solution in this case.
// If you make these classes abstract, you won't be able to create
// instances of them directly. Abstract classes are meant
// to be subclassed, and only their subclasses can be instantiated.
// In your case, you want to create instances of these
// classes and use them as delegate objects for the Dog, Cat, and Bird
// classes.

    override fun getAge() {
        println("Age: ")
        val age = readLine()!!.toDouble()
        println("Age is $age")
    }

    override fun getWeight() {
        println("Weight: ")
        val weight = readLine()!!.toDouble()
        println("Weight is $weight")
    }

    override fun getBreed() {
        println("Enter breed: ")
        val breed = readLine()!!.toString()
        println("Breed is $breed")
    }

}

class DogInfoImpl : AnimalInfo {

    override var name: String = ""

    override fun getAge() {
        println("Age is 5")
    }

    override fun getWeight() {
        println("Weight is 15")
    }

    override fun getBreed() {
        println("Breed is Labrador")
    }

}


class Dog(d: AnimalInfo) : AnimalInfo by d

class Cat(c: AnimalInfo) : AnimalInfo by c

class Bird(b: AnimalInfo) : AnimalInfo by b


// nullable receiver

fun Any?.customToString(): String {
    if (this == null) return "There's nothing here"
// first you check if the value is null and handle it

    return "Printing something: ${toString()}"
// if it is NOT null, you call the in-built toString() fun
// with a custom message that you add
}

class Bike


// extension properties

val BankAccounts.interestRate: Double
    get() = when (type) {
        AccountsTypes.SAVINGS -> 5.0
        AccountsTypes.YOUTH -> 8.5
        AccountsTypes.ENTERPRISE -> 2.5
    }

enum class AccountsTypes(val accountType: String) {
    SAVINGS("Savings"),
    YOUTH("Youth"),
    ENTERPRISE("Enterprise")
}

class BankAccounts(val type: AccountsTypes)


/*
// companion object extensions

fun BankAccounts.Companion.welcomeMessage() =  println("Welcome to the bank.")
// extension function declared on a companion object

val BankAccounts.interestRate: Double
    get() = when (accountType) {
        AccountsTypes.SAVINGS -> 5.0
        AccountsTypes.YOUTH -> 8.5
        AccountsTypes.ENTERPRISE -> 2.5
    }

enum class AccountsTypes(val accountType: String) {
    SAVINGS("Savings"),
    YOUTH("Youth"),
    ENTERPRISE("Enterprise")
}

class BankAccounts(val accountType: AccountsTypes) {
    companion object {}
// empty companion object
}
*/

// Declare extensions for one class inside another class

class Sharks(val fishType: String) {
    fun printFishType() {
        print("I am a $fishType")
    }

    fun printFishSpecies() {
        println("All sharks are mammals")
    }

    fun generalInfoAboutSharks() {
        println("There are 5000 types of sharks worldwide.")
    }
}

// this is the extension receiver type↑


// this is the dispatch receiver type↓
class WhiteSharks(val whiteShark: Sharks, val habitat: String) {

    fun printSharksHabitat() {
        print("I live in $habitat")
    }

    fun printFishSpecies() {
        println("All white sharks are mammals")
    }

    // an extension function declared as a memeber function
// inside another class
// it can access everything inside the extension receiver
// type and the dispatch receiver type
    fun Sharks.printAllInfo() {
        printFishType()
        print(" and ")
        printSharksHabitat()
        println("\n")
        this@WhiteSharks.printFishSpecies()
        generalInfoAboutSharks()
    }

// we create a function with the purpose of accessing
// the extension function declared as a member function
// as the extension function it applicable to its
// extension receiver type and is only accessible inside
// the scope of its dispatch receiver type and not outside it

    // so this is a NORMAL function of the dispatch receiver
// to access the extension function eclared inside it
    fun printWhiteSharksInfo() {
        whiteShark.printAllInfo()
    }

}

/*
// Name conflicts
class Sharks(val fishType: String){
    fun printFishType() { print("I am a $fishType") }

    fun printFishSpecies() { println("All sharks are mammals") }

    fun generalInfoAboutSharks() {println("There are 5000 types of sharks worldwide.")}
}

class WhiteSharks (val whiteShark: Sharks, val habitat: String) {

    fun printSharksHabitat() { print("I live in $habitat") }

    fun printFishSpecies() { println("All white sharks are mammals") }
// both the extension receiver and the dispatch receiver
// have a printFishSpecies()

    fun Sharks.printAllInfo() {
        printFishType()
        print(" and ")
        printSharksHabitat()
        println("\n")
        this@WhiteSharks.printFishSpecies()
// using the qualified this@ determine which one you're
//referring to
        generalInfoAboutSharks()
    }


    fun printWhiteSharksInfo() {whiteShark.printAllInfo()}

}

*/

// Declared as open and overridden

open class Mammal()

class Fish() : Mammal()

// the 2 classes on  which the extension functions will
// be declared

open class Shark() {

    open fun Mammal.hotBlooded() {
        println("I am hot blooded_Mammal from Shark")
    }

    open fun Fish.hotBlooded() {
        println("I am hot blooded_Fish from Shark")
    }

    fun printInfo(creature: Mammal) {
        creature.hotBlooded()
    }
// the type of the objet on which the extension function
// will be called is Mammal
// which means that the extension function declared on
// the Mammal class will ALWAYS be called even thought
// the Fish class extends it

}

class WhiteShark() : Shark() {

    override fun Mammal.hotBlooded() {
        println("I am hot blooded_Mammal from White Shark")
    }

    override fun Fish.hotBlooded() {
        println("I am hot blooded_Fish from White Shark")
    }
}

/*
//How to fix the problem
// DONOT use extension function and override them. Use normal member function.
open class Shark() {

    open fun hotBloodedMammal() {
        println("I am hot blooded_Mammal from Shark")
    }

    open fun hotBloodedFish() {
        println("I am hot blooded_Fish from Shark")
    }

    fun printInfo(creature: Shark) {
        creature.hotBloodedMammal()
        creature.hotBloodedFish()
    }
}

class WhiteShark() : Shark() {

    override fun hotBloodedMammal() {
        println("I am hot blooded_Mammal from White Shark")
    }

    override fun hotBloodedFish() {
        println("I am hot blooded_Fish from White Shark")
    }
}

 */