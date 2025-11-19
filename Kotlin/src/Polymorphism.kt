// Polymorphism : 'poly' means many and 'morph' means forms.
// Polymorphism is a fundamental concept in object-oriented programming that allows objects of different types to be treated as objects of a common base type.
// Polymorphism allows us to perform a single action in different ways.
// in other words, polymorphism allows you to define one interface and have multiple implementations.
// Polymorphism eg : A MAN -  who can be a Student, who can be a Businessman, who can be a Trainer Coach, who can be a Family Man

// Polymorphism Types:
// 1. Compile-time/static polymorphism : Achieved though function/method overloading.
// 2. Run-time/dynamic polymorphism : Achieved though function/method overriding

fun main() {
//   var rect:Shape = Rectangle()
//    rect.draw()
    // another example
    val array = arrayOf(Rectangle(), Circle(), Square(), Triangle())
    for (shape in array) {
        shape.draw()
    }
}

open class Shape {
    open fun draw() {
        println("Drawing a Shape")
    }
}

class Rectangle : Shape() {
    override fun draw() {
//        super.draw()
        println("Drawing a Rectangle")
    }
}

class Circle : Shape() {
    override fun draw() {
//        super.draw()
        println("Drawing a Circle")
    }
}

class Square : Shape() {
    override fun draw() {
//        super.draw()
        println("Drawing a Square")
    }
}

class Triangle : Shape() {
    override fun draw() {
//        super.draw()
        println("Drawing a Triangle")
    }
}