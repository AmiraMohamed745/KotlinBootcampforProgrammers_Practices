package com.example.kotlinbootcampforprogrammerstasks.beyondbasics.collections.list.equals


// when to implement equals() by yourself case 2
class People(private var name: String, private var age: Int) {

    var id: String = ""
// a property declared outside the constructor
// but must be taken into account when comparing objs

    override fun equals(other: Any?): Boolean =
        other is People && other.id == id
}

data class People2(private var name: String, private var age: Int) {

    var id: String = ""
// a property declared outside the constructor
// but must be taken into account when comparing objs

}
