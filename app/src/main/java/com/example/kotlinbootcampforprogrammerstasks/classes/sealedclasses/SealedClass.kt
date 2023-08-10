package com.example.kotlinbootcampforprogrammerstasks.classes.sealedclasses

sealed interface Specials {
    data class MondaySpecial(val day: String, val specials: List<String>) : Specials
    data class ThursdaySpecial(val day: String, val specials: List<String>, val discount: Double) :
        Specials

    object NoSpecial : Specials {
        val noSpecials = println("No specials today :(")
    }
}

// why sealed interface and not an enum?
// because the cases of the interface MondaySpecial and ThursdaySpecial
// have different attributes inside their contractors

// why an interface and not a class?
// because an enum class CANNOT inherit a class even if it's sealed

enum class MenuEnum(val type: String, val size: String, val pieces: Int) : Specials {
    PIZZA("Pepperoni pizza", "Medium", 8),
    BURGER("Cheese burger", "King size", 1),
    CHICKEN("Chicken wings", "Small", 4);

// we created an enum class for the 3 main meals because they
// all share the same attributes of type, size, and pieces

    companion object {

        fun printMainMenu(food: MenuEnum) = when (food) {
            PIZZA -> println("1- ${food.pieces} pieces of ${food.size} ${food.type}")
            BURGER -> println("2- ${food.pieces} ${food.size} ${food.type}")
            CHICKEN -> println("3- ${food.pieces} ${food.size} ${food.type}")
        }

// this function serves to get all the main meals  declared
// as constants of the enum class

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
// this function serves to get the specials based on the day

    }

}