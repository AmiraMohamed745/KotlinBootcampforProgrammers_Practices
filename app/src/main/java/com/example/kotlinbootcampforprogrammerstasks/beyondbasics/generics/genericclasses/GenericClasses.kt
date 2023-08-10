package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.genericclasses

open class WaterSupply(var needsProcessed: Boolean)

class TapWater() : WaterSupply(true) {
    fun addChemicalCleaners() =
        if (needsProcessed) "Adding chemicals" else "No need for chemicals"
}

class FishStoreWater() : WaterSupply(false)

class LakeWater() : WaterSupply(true) {
    fun filter() = if (needsProcessed) "Filtering" else "No need for filtering"
}


class Aquarium<T: WaterSupply>(val waterSupply: T) {

    fun addWater() {
        println("Adding water from $waterSupply")
    }
}