package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.annotations.initblock

data class UserAnnotations(
    val name: String,
    @AllowedRegex("\\d{4}-\\d{2}-\\d{2}") val birthDate: String
) {
    init {
        val fields = this::class.java.declaredFields
        fields.forEach { field ->
            field.annotations.forEach { annotation ->
                if (field.isAnnotationPresent(AllowedRegex::class.java)) {
// iterates over all fields of the class, and checks
//  if the @AllowedRegex annotation is present.

                    val regex = field.getAnnotation(AllowedRegex::class.java)?.regex
// If it is, the provided regex pattern is then used to validate the birth date.

                    if (regex?.toRegex()?.matches(birthDate) == false) {
                        throw IllegalAccessException("Invalid birth date")
                    }
// If the birth date doesn't match the pattern,
// an exception is thrown.
                }
            }
        }
    }
}

@Target(AnnotationTarget.FIELD)
annotation class AllowedRegex(val regex: String)

// Some of the strengths of this approach are:
// It's clear from looking at the field declaration what rules apply.
// The same rules can be easily applied to multiple fields, even across different classes.
// Since annotations can be used to generate code at compile-time,
// they can be used to create powerful and efficient rules that are "baked in" to your application.

// However, there are some **weaknesses:
// The rules enforced by annotations must be manually implemented.
// That is, having an annotation doesn't actually do anything by itself -
// you need to write code that checks the annotations and enforces the rules.
// This can be error-prone and repetitive.
// The annotations themselves are hard to test,
// because they're part of the metadata of the code rather than the runtime behavior.