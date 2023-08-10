package com.example.kotlinbootcampforprogrammerstasks.classes.abstractclasses

abstract class AquariumFeatures {
    abstract var length: Int
    // you CANNOT declare an abstract member in a non-abstract class
    abstract var width: Int
    abstract var height: Int
    open var volume: Int = 0
    // HOWEVER, you CAN declare non-abstract members in an abstract
// class
    open var bubbles: String = "Let's add some bubbles!"
    // the reason behind declaring volume + bubbles as non-abstract
// open properties is not to be FORCED to use them in all
// the DERIVED classes that will be inheriting the abstract one
    open fun buildAquarium() {
        println("Length: $length")
        println("Width: $width")
        println("Height: $height")
    }
}

class FirstAquarium : AquariumFeatures() {
    // when inheriting an abstract class you MUST add () as
// abstract classes possess a constructor
    override var length: Int = 10
    override var width: Int = 20
    override var height: Int = 30
    // overriding length + width + height is a MUST because they
// are abstract and ARE NOT  initialized in the abstract class
// and thus MUST be initialized in the DERIVED class
    override var volume: Int = length * width * height / 1000
    override var bubbles: String = super.bubbles
    override fun buildAquarium() {
        super.buildAquarium()
        println("Volume: $volume")
        println("Bubbles: $bubbles")
    }
}

class SecondAquarium : AquariumFeatures() {
    override var length: Int = 40
    override var width: Int = 50
    override var height: Int = 60
// we DO NOT override the fun buildAquarium as overriding only
// happen when you want to introduce CHANGES to the method being
// overridden. HOWEVER, here you do not add any extra implementation

}
