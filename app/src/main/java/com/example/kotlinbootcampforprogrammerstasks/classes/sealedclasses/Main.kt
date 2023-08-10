package com.example.kotlinbootcampforprogrammerstasks.classes.sealedclasses

fun main() {

    fun makeFoodWithEnum(){
        println("Main menu:")
        MenuEnum.printMainMenu(MenuEnum.PIZZA)
        MenuEnum.printMainMenu(MenuEnum.BURGER)
        MenuEnum.printMainMenu(MenuEnum.CHICKEN)
        println("\n")

        println("Menu specials:")
        MenuEnum.printSpecials("Monday")
        MenuEnum.printSpecials("Thursday")
        MenuEnum.printSpecials("Sunday")
    }
    makeFoodWithEnum()
}