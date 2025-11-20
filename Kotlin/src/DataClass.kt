fun main() {
    val student1 = Student("Scilent Knight", 21, 15)
    val student2 = Student("Scilent Knight", 21, 15)
    val student3 = student2.copy(name="Ram")

    println(student1.toString())
    // student1 and student2 hashCode is same but student3 hashCode is different because data is different
    println(student1.hashCode())
    println(student2.hashCode())
    println(student3.hashCode())

    println(student1.equals(student2))
    println(student1.equals(student3))

    println(student3)

    println(student3.component2())

    // destructuring data of student2 object
    val(studentName, studentAge, studentGrade) = student2
    println(studentName)
    println(studentAge)
    println(studentGrade)
}

// data class - used for data hold
data class Student(val name: String, val age: Int, var grade: Int)