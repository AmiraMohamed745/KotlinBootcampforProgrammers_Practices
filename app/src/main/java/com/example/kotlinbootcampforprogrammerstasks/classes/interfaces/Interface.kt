package com.example.kotlinbootcampforprogrammerstasks.classes.interfaces

interface AquariumMainFeatures {

    var length: Int
    var width: Int
    var height: Int

// properties CANNOT be intialized in interface

    fun getVolume() : Int
// ALL functions in an interface are ABSTRACT, hence, OPEN by nature

    fun fillBubbles(volume: Int): String {
        return if (volume >= 500) "You can add bubbles." else "Sorry, you can't add bubbles :("
    }
// to distinguish between an anbstract and normal function in
// an interface, simply if
// add a body ▶ NORMAL function
// DON'T add a body ▶ abstract
}

interface AquariumMainFeaturesSecond {

    fun getVolume(fish: Int, plants: Int, volume: Int): Int {
        return fish + plants + volume
    }

    fun fillBubbles(fish: Int, plants: Int): String {
        return if (fish + plants <= 20) "You can add bubbles." else "Sorry, you can't add bubbles :("
    }

}

class AquariumBasedInterface : AquariumMainFeatures, AquariumMainFeaturesSecond{

    override var length: Int = 20
    override var width: Int = 30
    override var height: Int = 40

    override fun getVolume() : Int {
        return length * width * height
    }
// if 2 interfaces have the SAME NAMING for 2 functions
// 1 ▶ ABSTRACT ➕ 2 ▶ NORMAL, then you ONLY HAVE TO override
// the abstract one

    override fun fillBubbles(volume: Int): String {
        return super<AquariumMainFeatures>.fillBubbles(volume)
    }
// if 2 interfaces have the SAME NAMING for 2 functions
// 1 ▶ NORMAL ➕ 2 ▶ NORMAL, then you HAVE TO  SPECIFY
// WHICH FUN YOU'RE OVERRIDING by usign<>

    override fun fillBubbles(fish: Int, plants: Int): String {
        return super<AquariumMainFeaturesSecond>.fillBubbles(fish, plants)
    }
}

// using the functions of the interfaces directly

interface FishAction {
    fun eat()
    fun migrate()
}

// You create 2 functions inside an interface

class Sharks : FishAction {
    override fun eat() {
        println("Sharks eating.")
    }

    override fun migrate() {
        println("Sharks migrating.")
    }

// these 2 functions WILL HAVE TO BE IMPLEMENTED inside each
// class inheriting the interface

}

class Whales : FishAction {
    override fun eat() {
        println("Whales eating.")
    }

    override fun migrate() {
        println("Whales migrating.")
    }

// these 2 functions WILL HAVE TO BE IMPLEMENTED inside each
// class inheriting the interface

}

// OR YOU CAN MAKE FUNCTIONS INSTEAD OF USING OBJECT
interface FishAction2 {
    fun eat()
    fun migrate()
}

class Sharks2 : FishAction {
    override fun eat() {
        println("Sharks eating.")
    }

    override fun migrate() {
        println("Sharks migrating.")
    }

}

class Whales2 : FishAction {
    override fun eat() {
        println("Whales eating.")
    }

    override fun migrate() {
        println("Whales migrating.")
    }

}

fun feedFish(fish: FishAction) {
    fish.eat()
}

// you create an feedFish func to access the eat() func by
// passing the object of the class from which you'd like
// to access the eat() func

fun migrateFish(fish: FishAction) {
    fish.migrate()
}

// you create an migrateFish func to access the migrate() func by
// passing the object of the class from which you'd like
// to access the migrate() func