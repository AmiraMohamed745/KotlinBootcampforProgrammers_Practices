package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.genericfunctions

interface BaseBuildingMaterial {
    val numberNeeded: Int
}

class Wood : BaseBuildingMaterial {
    override val numberNeeded: Int = 4
}


class Brick : BaseBuildingMaterial {
    override val numberNeeded: Int = 8
}

class Building<out T : BaseBuildingMaterial>(private val buildingMaterial: T) {
    private val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build() {
        println("Type of material: ${buildingMaterial::class.simpleName}")
        println("Number of materials needed: $actualMaterialsNeeded")
    }

}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}