package com.example.kotlinbootcampforprogrammerstasks.classes.enumclasses

fun main() {

    fun makeApplicants() {
        val applicants = ITIProgramRequirement.values()
        applicants.forEach {
            println("Applicant type: ${it.printableName}")
            println("Applicant number: ${it.ordinal}")
        }
    }
    makeApplicants()
}

/*
// Custom properties and function
fun main() {

    fun makeApplicants() {
        ITIProgramRequirement.UNDERGRADUATE.getProgramInfo()
// we had to add .UNDERGRADUATE because otherwise we CANNOT
// access the function
        println("--------------------------------------")
        val applicants = ITIProgramRequirement.values()
        applicants.forEach {
            println("Applicant type: ${it.printableName}")
            println("Applicant number: ${it.ordinal}")
        }
    }
    makeApplicants()
}
 */

/*
// How to access functions in an enum class by the class name only
fun makeApplicants() {
        ITIProgramRequirement.getProgramInfo()
// we only need the enum class name to access a function
// declared inside a companion object
        println("\n")
        val applicants = ITIProgramRequirement.values()
        applicants.forEach {
            println("Applicant type: ${it.printableName}")
            println("Applicant number: ${it.ordinal}")
        }
    }
    makeApplicants()
}
 */

/*
//  implementing abstract fun using anonymous classes
fun main() {

    fun makeApplicants() {
        ITIProgramRequirement.getProgramInfo()
        println("\n")

        // using the abstract class
        fun getApplicantsMaxAndMinNumbers() {
            println(
                "For ${ITIProgramRequirement.UNDERGRADUATE.printableName}s" +
                        " the maximum number is ${ITIProgramRequirement.UNDERGRADUATE.getMaximumStudentNumber()} " +
                        "and the minimum number is ${ITIProgramRequirement.UNDERGRADUATE.getMinimumStudentNumber()}"
            )
        }
// you create another function in main to get the result
// of the abstract functions
        getApplicantsMaxAndMinNumbers()
        println("\n")
    }
    makeApplicants()
}

 */

/*
// using anonymous classes to implement interface
fun main() {

    fun makeApplicants() {
        ITIProgramRequirement.getProgramInfo()
        println("\n")

        // using the abstract class
        fun getApplicantsMaxAndMinNumbers() {
            println(
                "For ${ITIProgramRequirement.UNDERGRADUATE.printableName}s" +
                        " the maximum number is ${ITIProgramRequirement.UNDERGRADUATE.getMaximumStudentNumber()} " +
                        "and the minimum number is ${ITIProgramRequirement.UNDERGRADUATE.getMinimumStudentNumber()}"
            )
        }
        getApplicantsMaxAndMinNumbers()
        println("\n")

        // using the interface

        ITIProgramRequirement.UNDERGRADUATE.getApplicantsNumbers()
// you call the implementation by the class name.constant.function
        ITIProgramRequirement.GRADUATE.getApplicantsNumbers()
        ITIProgramRequirement.EMPLOYEE.getApplicantsNumbers()
        println("\n")


    }
    makeApplicants()
}
 */

/*
// Common implementation of interface ➕ this
fun main() {

    fun makeApplicants() {
        ITIProgramRequirement.getProgramInfo()
        println("\n")

        // using the abstract class
        fun getApplicantsMaxAndMinNumbers() {
            println(
                "For ${ITIProgramRequirement.UNDERGRADUATE.printableName}s" +
                        " the maximum number is ${ITIProgramRequirement.UNDERGRADUATE.getMaximumStudentNumber()} " +
                        "and the minimum number is ${ITIProgramRequirement.UNDERGRADUATE.getMinimumStudentNumber()}"
            )
        }
        getApplicantsMaxAndMinNumbers()
        println("\n")

        // using the interface

        ITIProgramRequirement.UNDERGRADUATE.getApplicantsNumbers()
// you still call the implementation by
// the class name.constant.function
        ITIProgramRequirement.GRADUATE.getApplicantsNumbers()
        ITIProgramRequirement.EMPLOYEE.getApplicantsNumbers()
        println("\n")


    }
    makeApplicants()
}
 */

/*
// Another example
fun main() {

    fun makeApplicants() {
        ITIProgramRequirement.getProgramInfo()
        println("\n")

        ITIProgramRequirement.UNDERGRADUATE.getApplicantsNumbers()
        println("Requirements: ${ITIProgramRequirement.getRequirements(ITIProgramRequirement.UNDERGRADUATE)}")
        println("\n")
        ITIProgramRequirement.GRADUATE.getApplicantsNumbers()
        println("Requirements: ${ITIProgramRequirement.getRequirements(ITIProgramRequirement.GRADUATE)}")
        println("\n")
        ITIProgramRequirement.EMPLOYEE.getApplicantsNumbers()
        println("Requirements: ${ITIProgramRequirement.getRequirements(ITIProgramRequirement.EMPLOYEE)}")
        println("\n")


    }
    makeApplicants()
}
 */