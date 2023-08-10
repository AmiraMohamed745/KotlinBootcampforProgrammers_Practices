package com.example.kotlinbootcampforprogrammerstasks.classes.objectkeyword.objectexpressions

interface FishInoInTankOne {
    fun getAge () = 20
    fun getType () = "Atlantic"
    fun getFood () = "Little fish"
}

class FishTankOne {

    fun printFishInfo(
        name: String,
        color: String,
        otherInfo: FishInoInTankOne = object : FishInoInTankOne {
            init {
                println("Age: ${getAge()}.")
                println("Type: ${getType()}.")
                println("Food: ${getFood()}.")
            }
        }
    ) {
        println("Name: $name.")
        println("Color: $color.")
    }

}