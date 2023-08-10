package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.extensions

fun main() {

    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val tmp = this[index1] // 'this' corresponds to the list
        this[index1] = this[index2]
        this[index2] = tmp
    }

    val shape = Shape()
    val rectangle = Rectangle()
    printClassInfo(shape)
    printClassInfo(rectangle)
    println("\n")

    println(shape.getName())
    println(shape.getNumbers())
    println(rectangle.getName())
    println(rectangle.getNumbers())

    val parent = Parent()
    parent.getJobs("Lawyer")


    val child = Child()
    child.getSchool("Innocent Kids")
    child.getSchool("Innocent Kids", "7th Street")
// even though BOTH functions have the same NAME
// the outcome is different as the extension func has different
// parameter than the member function


    val dogToImplSpecific = DogInfoImpl()
    val dogToImplGeneral = AnimalInfoImpl()
    val catToImplGeneral = AnimalInfoImpl()
    val birdToImplGeneral = AnimalInfoImpl()

    println("Specific dog:")
    val dogLabrador515 = Dog(dogToImplSpecific)
    dogLabrador515.getGeneralInfo()

    println("\n")

    println("General dog:")
    val anyDog = Dog(dogToImplGeneral)
    anyDog.getGeneralInfo()


    println("\n")

    println("Cat:")
    val cat = Cat(catToImplGeneral)
    cat.getGeneralInfo()

    println("\n")

    println("Bird:")
    val bird = Bird(birdToImplGeneral)
    bird.getGeneralInfo()


    // nullable receiver

    val bike: Bike? = null
    val bike2 = Bike()
    println(bike.customToString())
    println(bike2.customToString())
    println("\n")

    // extension properties

    val savingsAccount = BankAccounts(AccountsTypes.SAVINGS)
    val youthAccount = BankAccounts(AccountsTypes.YOUTH)
    val enterpriseAccounts = BankAccounts(AccountsTypes.ENTERPRISE)

    println("Savings Interest Rate: ${savingsAccount.interestRate}")
    println("Youth Interest Rate: ${youthAccount.interestRate}")
    println("Enterprise Interest Rate: ${enterpriseAccounts.interestRate}")

    /*
    // companion object extensions
    val savingsAccount = BankAccounts(AccountsTypes.SAVINGS)
    val youthAccount = BankAccounts(AccountsTypes.YOUTH)
    val enterpriseAccounts = BankAccounts(AccountsTypes.ENTERPRISE)

    BankAccounts.welcomeMessage()
// accessing the extension function by the class name
    println("Savings Interest Rate: ${savingsAccount.interestRate}")
    println("Youth Interest Rate: ${youthAccount.interestRate}")
    println("Enterprise Interest Rate: ${enterpriseAccounts.interestRate}")
     */


    // Declare extensions for one class inside another class
    val sharks = Sharks(fishType = "White shark")
    val whiteShark = WhiteSharks(whiteShark = sharks, "Atlantic ocean")
    whiteShark.printWhiteSharksInfo()


    // Declared as open and overridden
    Shark().printInfo(Mammal())
    Shark().printInfo(Fish())
    WhiteShark().printInfo(Mammal())
    WhiteShark().printInfo(Fish())


/*
    // How to fix the problem
    Shark().printInfo(Shark())
    WhiteShark().printInfo(WhiteShark())

*/
}