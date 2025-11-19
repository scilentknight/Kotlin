// Inheritance : Inheritance is the process by which a new class (called a subclass or derived class or child class) is created from an existing class (called a superclass or base class or parent class). The subclass inherits attributes and methods from the superclass.

// Key Aspects of Inheritance:
// 1. Code Reuse : Inheritance promotes the reuse of existing code, reducing redundancy.
// 2. Hierarchy : It creates a hierarchical relationship between classes.
// 3. Extensibility : New features can be added to derived classes without modifying the base class.

// Types of Inheritance
// 1. Simple Inheritance : Class B --> Class A ( Class A is parent class)
// Multilevel Inheritance : Class C --> Class B --> Class A (Class A is grandparent class, Class B is parent class and Class C is child class)
// Hierarchical Inheritance : Class B --> Class A, Class C --> Class A (Both Class B and Class C are child classes and Class A is parent class)

fun main() {
    var derived = DerivedClass()
    println(derived.name)
   // derived.method1()
    println(derived.name2)
    derived.method2()
}

open class BaseClass {
    var name = "BaseClass"

    fun method1() {
        println("I am Base Class")
    }
}


class DerivedClass : BaseClass() {
    var name2 = "DerivedClass"

    fun method2() {
        print("I am $name from base class") // base class property (name) called from derived class
        println(" I am Derived Class")
    }
}