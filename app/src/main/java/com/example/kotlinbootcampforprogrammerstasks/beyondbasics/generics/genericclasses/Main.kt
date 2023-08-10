package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.genericclasses

fun main() {

    fun genericExample() {

        val aquarium = Aquarium(TapWater())
        aquarium.addWater()
        println(aquarium.waterSupply.addChemicalCleaners())


        val aquarium2 = Aquarium(LakeWater())
        aquarium2.addWater()
        println(aquarium2.waterSupply.filter())

    }

    genericExample()

}