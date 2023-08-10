package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.annotations.separatefunction

// Extension version

fun UserExtensionFunction.isValidBirthDate() {
    if (!this.birthDate.matches("\\d{4}-\\d{2}-\\d{2}".toRegex())) {
        throw IllegalAccessException("Invalid birth date")
    }
}

data class UserExtensionFunction(
    val name: String,
    val birthDate: String
) {
    init {
        isValidBirthDate()
    }
}

// class 1 enforcing the annotation

data class UserAnnotations(
    val name: String,
    @AllowedRegex("\\d{4}-\\d{2}-\\d{2}") val birthDate: String
) {
    init {
        enforceAllowedRegex(this)
    }
}

// class 2 enforcing the annotation
data class UserAnnotationsTwo(
    val name: String,
    @AllowedRegex("\\d{4}-\\d{2}-\\d{2}") val birthDate: String,
    val bloodType: String
) {
    init {
        enforceAllowedRegex(this)
    }
}

// the annotation
@Target(AnnotationTarget.FIELD)
annotation class AllowedRegex(val regex: String)

// its logic

fun enforceAllowedRegex(obj: Any) {
    val fields = obj::class.java.declaredFields
    fields.forEach { field ->
        field.isAccessible = true
        field.annotations.forEach { annotation ->
            if (field.isAnnotationPresent(AllowedRegex::class.java)) {
                val regex = field.getAnnotation(AllowedRegex::class.java)?.regex
                val fieldValue = field.get(obj) as String
                if (regex?.toRegex()?.matches(fieldValue) == false) {
                    throw IllegalAccessException("Invalid field value for ${field.name}")
                }
            }
        }
    }
}