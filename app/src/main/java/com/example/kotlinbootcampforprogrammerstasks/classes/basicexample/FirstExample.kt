package com.example.kotlinbootcampforprogrammerstasks.classes.basicexample

class Lamp {

    private var isOn: Boolean = false
// since the property has the modifier private you cannot access it
// anywhere else and that is why wer resort to making to functions
// for when the lamp is turned on (turnOn()) and for when it is off
// (turnOff())

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun displayStatus(lampName: String): Unit =
        if (!isOn) println ("$lampName is off.") else println("$lampName is on.")

}

// if (isOn) → means when isOn is true EVEN if you intialize it to false
// if (!isOn) → means when isOn is false EVEN if you intialize it to false
// meaning that the absecnce of ! or it is existence idicates the noramal
// true or !false condition. IT IS NOT THE CONTRADICTION OF THE INTIALIZATINO
