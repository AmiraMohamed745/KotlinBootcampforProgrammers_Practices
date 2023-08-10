package com.example.kotlinbootcampforprogrammerstasks.classes.delegation.differentexamples

// Is it better to delegate the implementation of an interface to an instance
// provided in the class constructor or delegate the implementation of an interface
// to an instance of the class implementing the interface?

// To an instance provided in the class constructor

interface AnimalInfo {
    fun getAge(age: Double)
    fun getWeight(weight: Double)
    fun getBreed()
}

// first impl of the interface
class AnimalInfoImpl() : AnimalInfo {


    override fun getAge(age: Double) {
        println("Age is $age")
    }

    override fun getWeight(weight: Double) {
        println("Weight is $weight")
    }

    override fun getBreed() {
        println("Enter breed: ")
        val breed = readLine()!!.toString()
        println("Breed is $breed")
    }

}

// second impl of the interface
class DogInfoImpl() : AnimalInfo {

    override fun getAge(age: Double) {
        println("Age is $age")
    }

    override fun getWeight(weight: Double) {
        println("Weight is $weight")
    }

    override fun getBreed() {
        println("Breed is Labrador")
    }

}


// adding an instance in the constructor and storing
// the impl of the interface inside it
// this allows you to choose whichever impl of the interface
// you wanna, whether 1 or 2
class Dog(d: AnimalInfo, val name: String) : AnimalInfo by d {
    init {
        println("Dog name is $name")
    }
}

// To an instance of the class implementing the interface

interface AnimalInfo2 {
    fun getAge(age: Double)
    fun getWeight(weight: Double)
    fun getBreed()
}

// first impl of the interface
class AnimalInfoImpl2() : AnimalInfo2 {


    override fun getAge(age: Double) {
        println("Age is $age")
    }

    override fun getWeight(weight: Double) {
        println("Weight is $weight")
    }

    override fun getBreed() {
        println("Enter breed: ")
        val breed = readLine()!!.toString()
        println("Breed is $breed")
    }

}

// second impl of the interface
class DogInfoImpl2() : AnimalInfo2 {

    override fun getAge(age: Double) {
        println("Age is $age")
    }

    override fun getWeight(weight: Double) {
        println("Weight is $weight")
    }

    override fun getBreed() {
        println("Breed is Labrador")
    }

}


// specifying a specific implementation for the interface
// which is the impl of the class DogInfoImpl()
// that has a fixed breed
class Dog2(val name: String) : AnimalInfo2 by DogInfoImpl2(){
    init {
        println("Dog name is $name")
    }
}