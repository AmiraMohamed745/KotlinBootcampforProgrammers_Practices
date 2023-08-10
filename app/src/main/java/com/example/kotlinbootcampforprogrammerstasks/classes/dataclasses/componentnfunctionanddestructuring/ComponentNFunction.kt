package com.example.kotlinbootcampforprogrammerstasks.classes.dataclasses.componentnfunctionanddestructuring

data class Decorations(val type: String, val number: Int, val position: String)

class Decoration(private val type: String, private val number: Int, private val position: String) {

    override fun toString(): String {
        return "Decorations info: add $number $type at the $position"
    }

}