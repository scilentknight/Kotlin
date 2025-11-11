fun main() {
    var a = 35
    var b = 40

    if(a>b){
        println("$a is greater than $b.")
    } else {
        println("$b is greater than $a.")
    }
    // OR
    println(if(a>b) "$a is greater than $b" else "$b is greater than $a")
    // Simple
    val c = if(a>b) a else b
    println("Greater number is: $c")


    // ---------------------------------------------------
    var marks = 50

    var grade = if(marks>60) "Excellent" else if(marks<60 && marks>45) "Good" else "Poor"
    println("Your grade is: $grade")

}