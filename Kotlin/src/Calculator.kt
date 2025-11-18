fun add(a: Double,b: Double):Double{
    return a+b
}
fun subtract(a: Double, b: Double): Double{
    return a-b
}
fun multiply(a: Double, b: Double): Double{
    return a*b
}
fun division(a: Double, b: Double): Double{
    if(b != 0.0){
        return a/b
    }
    else{
        println("Error: Cannot divide by zero")
        return 0.0
    }
}
fun main() {
    println("Simple Calculator in Kotlin")

    print("Enter first number: ")
    var num1 = readLine()!!.toDouble()

    print("Enter secont number: ")
    var num2 = readLine()!!.toDouble()

    print("Enter operator (+, -, *, /): ")
    var operator = readLine()!![0]

    val result = when(operator){
        '+' -> add(num1, num2)
        '-' -> subtract(num1, num2)
        '*' -> multiply(num1, num2)
        '/' -> division(num1, num2)
        else -> {
            println("invalid operator")
            return
        }
    }
    println("Result: $num1 $operator $num2 is: $result")

}
