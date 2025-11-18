// Object-Oriented Programmin (OOP) is a programming paradigm based on the concept of "object", which can contain data, in the form of fields (often known as attributes or properties), and code, in the form of procedures (often known as methods)
// The key principles includes: Encapsulation, Abstraction, Polymorphism, Inheritance

// Class: A class is a blueprint or template for creating objects. It defines the properties (attributes) and behaviors (methods) that objects of that class will have. Single class may have multiple objects.

// Object : An object is an instance of a class. Objects represent real-world entities or concepts. Each object has its own set of properties (defined by the class attributes) and can perform actions (defined by the class methods).

//class Person{
//    var name:String = "Prakash"
//    var age: Int = 21
//    var gender: String = "Male"
//    var occupation: String = "Student"
//
//    fun work(){
//        print("$name is $occupation")
//    }
//    fun getAge(){
//        print("Age is $age")
//    }
//    fun getGender(){
//        print("Gender is $gender")
//    }
//}

class Person(var name: String, var age:Int, var gender: String, var occupation: String) { // primary constructor
    fun work() {
        println("$name is $occupation")
    }

    fun getAge() {
        println("Age is $age")
    }

    fun getGender() {
        println("Gender is $gender")
    }
}

fun main() {
    // Every object will have different memory allocation
    var person1 = Person("Prakash", 21, "Male", "Student")
    println("Name of person is: ${person1.name}")
    person1.work()
    person1.getAge()
    person1.getGender()

    var person2 = Person("Anupa", 22, "Female", "Business")
    println("Name of person is: ${person2.name}")
    person2.work()
    person2.getAge()
    person2.getGender()
}


