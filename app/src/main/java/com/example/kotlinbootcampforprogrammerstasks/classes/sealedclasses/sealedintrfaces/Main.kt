package com.example.kotlinbootcampforprogrammerstasks.classes.sealedclasses.sealedintrfaces

fun main() {
    fun makeFoodWithSealedClass() {
        println("Main menu:")
        MenuSealedClass.getMenu(MenuSealedClass.Pizza("Pepperoni pizza", "Medium", 8))
        MenuSealedClass.getMenu(MenuSealedClass.Burger("Cheese burger", "King size"))
        MenuSealedClass.getMenu(MenuSealedClass.Macaroni("Mac and cheese", "1 bowl"))
        MenuSealedClass.getMenu(MenuSealedClass.NotOnMenu)
        println("\n")

        println("Menu specials:")
        MenuSealedClass.printSpecials("Monday")
        MenuSealedClass.printSpecials("Thursday")
        MenuSealedClass.printSpecials("Sunday")
    }
    makeFoodWithSealedClass()
}