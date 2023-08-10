package com.example.kotlinbootcampforprogrammerstasks.classes.sealedclasses.sealedintrfaces

sealed interface Specials {
    data class MondaySpecial(val day: String, val specials: List<String>) : Specials
    data class ThursdaySpecial(val day: String, val specials: List<String>, val discount: Double) :
        Specials

    class AddOns(private val addOns: List<String>) : Specials {
        val burgerAddOns = addOns
    }
    object NoSpecial : Specials {
        val noSpecials = println("No specials today :(")
    }
}


sealed class MenuSealedClass : Specials {
    data class Pizza(val type: String, val size: String, val pieces: Int) : MenuSealedClass()
    data class Burger(val type: String, val size: String) : MenuSealedClass()
    data class Macaroni(val type: String, val numberOfBowls: String) : MenuSealedClass()
    object NotOnMenu : MenuSealedClass() {
        val notOnTheMenu = println("Not on the menu")
    }

// the sealed class inherits the sealed interface
// since all classes in the sealed class inherit the sealed class,
// this means they also have access to the interface

    companion object {
        fun getMenu(food: MenuSealedClass) = when (food) {
            is Burger -> println(
                "${food.size} ${food.type} with ${
                    Specials.AddOns(
                        listOf("Ketchup",
                            "Onion")
                    ).burgerAddOns
                }"
            )
            is Macaroni -> println("${food.numberOfBowls} of ${food.type}")
            is Pizza -> println("${food.pieces} pieces of ${food.size} ${food.type}")
            is NotOnMenu -> NotOnMenu.notOnTheMenu
        }


        fun printSpecials(day: String) = when (day) {
            "Monday" -> println(
                Specials.MondaySpecial(
                    "Monday",
                    specials = listOf("Smoked Chicken", "Meat balls")
                )
            )
            "Thursday" -> println(
                Specials.ThursdaySpecial(
                    "Thursday",
                    specials = listOf("Smoked Beef", "Rice"),
                    10.5
                )
            )
            else -> {Specials.NoSpecial.noSpecials}
        }
    }

}
