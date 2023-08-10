package com.example.kotlinbootcampforprogrammerstasks.classes.objectkeyword.objectexpressions

fun main() {

    fun makeFish(){
        val fishTankOne = FishTankOne()
        fishTankOne.printFishInfo("Shark", "Grey")
        fishTankOne.printFishInfo("Whale", "Black")
    }
    makeFish()
}