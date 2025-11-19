// Constructor Types
// 1. Default Constructor / Empty Constructor - var animal = Animal()
// 2. Primary Constructor
// 3. Secondary Constructor
fun main() {
    var animal1 = Animal("Cow", 5, "Jersey", "Black")
    val animal2 = Animal("Dog", "White")
}

// Primary constructor
class Animal(var name: String, var age: Int, var breed: String, var color: String) {
    // Secondary constructor
    constructor(animalName: String, animalColor: String) : this(
        animalName,
        1,
        "None",
        animalColor
    ) // here this indicates primary constructor

    init {
        println("Name of animal is: $name")
    }

    init {
        println("Breed of animal is: $breed")
    }

    init {
        println("Color of animal is: $color")
    }
}