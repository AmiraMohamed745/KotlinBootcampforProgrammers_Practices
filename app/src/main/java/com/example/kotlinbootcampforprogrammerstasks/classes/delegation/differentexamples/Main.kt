package com.example.kotlinbootcampforprogrammerstasks.classes.delegation.differentexamples

fun main() {

// creating an instance of the second impl
    val dog = DogInfoImpl()

// creating an instance of the first impl
    val dog2 = AnimalInfoImpl()

// passing the instance to the constructor
    val dogFromDogClass = Dog(dog, "Suzy")
    dogFromDogClass.getBreed()
    dogFromDogClass.getAge(3.5)
    dogFromDogClass.getWeight(17.0)
    println("\n")
    val dogFromDogClass2 = Dog(dog2, "Nini")
    dogFromDogClass2.getBreed()
    dogFromDogClass2.getAge(3.5)
    dogFromDogClass2.getWeight(17.0)


// NO NEED TO CREATE INSTANCE OF THE CLASSES
// IMPLEMENTING THE INTERFACE AS NO MATTER WHAT, THE INTERFACE
// WILL ALWAYS BE IMPLEMENTED BY AN INSTANCE OF DogInfoImpl()

// passing the instance to the constructor
    val dogFromDogClass3 = Dog2("Suzy")
    dogFromDogClass3.getBreed()
    dogFromDogClass3.getAge(3.5)
    dogFromDogClass3.getWeight(17.0)
    println("\n")
    val dogFromDogClass4 = Dog2("Nini")
    dogFromDogClass4.getBreed()
    dogFromDogClass4.getAge(3.5)
    dogFromDogClass4.getWeight(17.0)

}
