// Nested/Inner Class Example

open class OuterClass{
    var name = "OuterClass"
    inner class InnerClass{ // private properties can be accessible inside inner class
        fun innerFunction(){
            println("Inside inner class $name")
        }
    }
}

fun main() {
    val ic = OuterClass().InnerClass()// inner class object creating after outer class object
    ic.innerFunction()
}