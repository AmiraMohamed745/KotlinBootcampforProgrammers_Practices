package com.example.kotlinbootcampforprogrammerstasks.classes.propertydelegation

fun main() {

    val order = Order()
    order.customerName =  " Amira"
    order.paymentMethod  = "Debit Card"
    order.branchName = "Haram "
    order.paidAmount = 100
    order.printReceipt()
}