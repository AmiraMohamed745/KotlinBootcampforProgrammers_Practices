package com.example.kotlinbootcampforprogrammerstasks.classes.propertydelegation

import kotlin.reflect.KProperty
// You HAVE TO add this import line so property: KProperty<*>
// does not give an error


class Order {
    var customerName: String by OrderConditions()
    var branchName: String by OrderConditions()
    var paymentMethod: String by OrderConditions()
    // you HAVE to add the () after the delegate class name
    var paidAmount: Int = 0

    fun printReceipt() {
        println("Customer name: $customerName")
        println("Branch: $branchName")
        println("Payment method: $paymentMethod")
        println("Paid amount: $paidAmount")
    }
}

class OrderConditions {

    private var finalResult: String = ""
// using MUST use a property declared in the class
// body NOT inside the constructor so that the setter works

    operator fun getValue(thisRef: Order, property: KProperty<*>): String {
        return finalResult
    }

    operator fun setValue(thisRef: Order, property: KProperty<*>, value: String) {
        if (value.length >= 3) finalResult = value.trim().uppercase()
    }

}