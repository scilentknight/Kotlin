// Only one companion object is allowed per class
/*
fun main() {
   Persons.name()  // companion object call
   Persons.Teacher.name()
   Persons.Doctor.name()
}

class Persons{
    companion object Student{
        fun name(){
            println("It's Student")
        }
    }
    object Teacher{
        fun name(){
            println("It's Teacher")
        }
    }
    object Doctor{
        fun name(){
            println("It's Doctor")
        }
    }
}
*/
 // Another Example
// factory pattern implementation with the help of companion object
fun main() {
    var person1 = Persons.create("student")
    println(person1.type)
}
class Persons private constructor(val type: String){ // force to create object using object method only
    companion object Factory{
        fun create(type:String):Persons{
             return when(type){
                "student" -> Persons("student")
                "teacher" -> Persons("teacher")
                else -> Persons("person")
            }
        }
    }
}
