package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.generics.genericfunctions

fun main() {

    fun createBuildings() {
        val woodBuilding = Building(Wood())
        woodBuilding.build()
        isSmallBuilding(woodBuilding)


        val brickBuilding = Building(Brick())
        brickBuilding.build()
        isSmallBuilding(brickBuilding)

// to be able to pass the instance of Building() like woodBuilding
// or brickBuilding
// the isSmallBuilding function MUST take an instance of Building()
// NOT BaseBuildingMaterial as its argument
// class Building<out T : BaseBuildingMaterial>(private val buildingMaterial: T)
    }
    createBuildings()

}