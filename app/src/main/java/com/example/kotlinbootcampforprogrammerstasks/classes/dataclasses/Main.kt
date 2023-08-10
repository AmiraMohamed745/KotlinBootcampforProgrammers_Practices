package com.example.kotlinbootcampforprogrammerstasks.classes.dataclasses

fun main() {

    fun makeEGBANK() {
        val egbank1 = EGBANK(
            "New Haram", "406 Giza, Ahmed Amin ST",
            "From 8AM to 3PM"
        )

        egbank1.services = listOf("Savings account", "Certificates")
        egbank1.funds = "Thraa"
        egbank1.capital = 1000000
        println("Services: ${egbank1.services}")
        println("Funds: ${egbank1.funds}")
        println("Capital: ${egbank1.capital}")
        println("\n")

        val egbank2 = EGBANK(
            "New Haram", "406 Giza, Ahmed Amin ST",
            "From 8AM to 3PM"
        )

        egbank2.services = listOf("Savings account")
        egbank2.funds = "Izdhar"
        egbank2.capital = 5000000
        println("Services: ${egbank2.services}")
        println("Funds: ${egbank2.funds}")
        println("Capital: ${egbank2.capital}")
        println("\n")

        println("Does object egbank1 the same as egbank2: ${egbank1 == egbank2}")

    }

    makeEGBANK()
}