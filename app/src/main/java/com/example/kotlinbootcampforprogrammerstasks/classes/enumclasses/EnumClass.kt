package com.example.kotlinbootcampforprogrammerstasks.classes.enumclasses

enum class ITIProgramRequirement(val printableName: String) {
    UNDERGRADUATE("Undergraduate"),
    GRADUATE("Graduate"),
    EMPLOYEE("Employee")
}
// you add printableName because the default property name
// gets the name you use to declare the constant

//BEWARE that if you don't declare the printableName property
// as val or var you WILL NOT be able to access inside main()



/*
// Custom properties and function
enum class ITIProgramRequirement(val printableName: String) {
    UNDERGRADUATE("Undergraduate"),
    GRADUATE("Graduate"),
    EMPLOYEE("Employee");
// you add an enum class members AFTER the constants
// the last constant should be preceded by a SEMICOLON

    private val programProvider : String = "Ministry of Communication and ITI Institute"
    var programName: String = "Flutter Development"

    fun getProgramInfo() {
        println("$programProvider offer a 3 months program in $programName.")
    }
// this function is an instance function and can only be
// accessed by one of the constants
}

 */


/*
// How to access functions in an enum class by the class name only
enum class ITIProgramRequirement(val printableName: String) {
    UNDERGRADUATE("Undergraduate"),
    GRADUATE("Graduate"),
    EMPLOYEE("Employee");

    companion object {
        private const val programProvider: String = "Ministry of Communication and ITI Institute"
        var programName: String = "Flutter Development"

        fun getProgramInfo() {
            println("$programProvider offer a 3 months program in $programName.")
        }
    }

}
 */



/*
//  implementing abstract fun using anonymous classes
enum class ITIProgramRequirement(val printableName: String) : ApplicantsNumbers {

    UNDERGRADUATE("Undergraduate") {
        override fun getMaximumStudentNumber() = 10
        override fun getMinimumStudentNumber() = 5
// providing special implementation for the 2 abstract functions
// by using the anonymous class

    },

    GRADUATE("Graduate") {
        override fun getMaximumStudentNumber() = 15
        override fun getMinimumStudentNumber() = 8

    },

    EMPLOYEE("Employee") {
        override fun getMaximumStudentNumber() = 20
        override fun getMinimumStudentNumber() = 8

    };

    abstract fun getMaximumStudentNumber(): Int
    abstract fun getMinimumStudentNumber(): Int

// creating 2 abstract functions

    companion object {
        private const val programProvider: String = "Ministry of Communication and ITI Institute"
        var programName: String = "Flutter Development"

        fun getProgramInfo() {
            println("$programProvider offer a 3 months program in $programName.")
        }

    }

}

 */

/*
// using anonymous classes to implement interface
interface ApplicantsNumbers {
    fun getApplicantsNumbers()
}
// make an interface

enum class ITIProgramRequirement(val printableName: String) : ApplicantsNumbers {
// the enum class will implement this interface
    UNDERGRADUATE("Undergraduate") {
        override fun getMaximumStudentNumber() = 10
        override fun getMinimumStudentNumber() = 5
        override fun getApplicantsNumbers() {
            println("For ${this.printableName}s the maximum number of students is" +
                    " ${this.getMaximumStudentNumber()} and the minimum is ${this.getMinimumStudentNumber()}")
        }
// implement the interface using anonymous classes
// which means each constant will have its own implementation
// however, since the implementation required is the same for
// each constant, using anonymous classes is REDUNDANT
// this is better done using a common implementation which
// gets declared as a member after the ;
    },

    GRADUATE("Graduate") {
        override fun getMaximumStudentNumber() = 15
        override fun getMinimumStudentNumber() = 8
        override fun getApplicantsNumbers() {
            println("For ${this.printableName}s the maximum number of students is" +
                    " ${this.getMaximumStudentNumber()} and the minimum is ${this.getMinimumStudentNumber()}")
        }
    },

    EMPLOYEE("Employee") {
        override fun getMaximumStudentNumber() = 20
        override fun getMinimumStudentNumber() = 8
        override fun getApplicantsNumbers() {
            println("For ${this.printableName}s the maximum number of students is" +
                    " ${this.getMaximumStudentNumber()} and the minimum is ${this.getMinimumStudentNumber()}")
        }
    };

    abstract fun getMaximumStudentNumber(): Int
    abstract fun getMinimumStudentNumber(): Int


    companion object {
        private const val programProvider: String = "Ministry of Communication and ITI Institute"
        var programName: String = "Flutter Development"

        fun getProgramInfo() {
            println("$programProvider offer a 3 months program in $programName.")
        }

    }

}

 */

/*
// Common implementation of interface ➕ this
interface ApplicantsNumbers {
    fun getApplicantsNumbers()
}

enum class ITIProgramRequirement(val printableName: String) : ApplicantsNumbers {

    UNDERGRADUATE("Undergraduate") {
        override fun getMaximumStudentNumber() = 10
        override fun getMinimumStudentNumber() = 5
    },

    GRADUATE("Graduate") {
        override fun getMaximumStudentNumber() = 15
        override fun getMinimumStudentNumber() = 8

    },

    EMPLOYEE("Employee") {
        override fun getMaximumStudentNumber() = 20
        override fun getMinimumStudentNumber() = 8

    };

    override fun getApplicantsNumbers() {

        println("For ${this.printableName}s the maximum number of students is" +
                " ${this.getMaximumStudentNumber()} and the minimum is ${this.getMinimumStudentNumber()}")

    }

// override the function of the interface as a common implementation
// after the ;

    abstract fun getMaximumStudentNumber(): Int
    abstract fun getMinimumStudentNumber(): Int


    companion object {
        private const val programProvider: String = "Ministry of Communication and ITI Institute"
        var programName: String = "Flutter Development"

        fun getProgramInfo() {
            println("$programProvider offer a 3 months program in $programName.")
        }

    }

}
 */

/*
// Another example

interface ApplicantsNumbers {
    fun getApplicantsNumbers()
}

enum class ITIProgramRequirement(val printableName: String) : ApplicantsNumbers {

    UNDERGRADUATE("Undergraduate") {
        override fun getMaximumStudentNumber() = 10
        override fun getMinimumStudentNumber() = 5
    },

    GRADUATE("Graduate") {
        override fun getMaximumStudentNumber() = 15
        override fun getMinimumStudentNumber() = 8

    },

    EMPLOYEE("Employee") {
        override fun getMaximumStudentNumber() = 20
        override fun getMinimumStudentNumber() = 8

    };

    override fun getApplicantsNumbers() {

        println("For ${this.printableName}s the maximum number of students is" +
                " ${this.getMaximumStudentNumber()} and the minimum is ${this.getMinimumStudentNumber()}")

    }

    abstract fun getMaximumStudentNumber(): Int
    abstract fun getMinimumStudentNumber(): Int


    companion object {
        private const val programProvider: String = "Ministry of Communication and ITI Institute"
        var programName: String = "Flutter Development"

        fun getProgramInfo() {
            println("$programProvider offer a 3 months program in $programName.")
        }

        fun getRequirements(typeOfApplicant: ITIProgramRequirement): String {
 // the parameter of-the function is of type enum class
// the return type of the whole function is what will be on the
// right-hand side of the when statement
// to automatically add the when branches just press alt + enter
        return when (typeOfApplicant) {
// the parameter of when is the function parameter
                UNDERGRADUATE -> "National ID, College ID"
                GRADUATE -> "National ID, University certificate"
                EMPLOYEE -> "National ID, Statement of payroll"
            }
        }
    }

}
 */

