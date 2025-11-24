// Lambda Function is a function which is an anonymous function (means without name function)
/*
fun main() {
    var lambdaFunction1 = { a: Int, b: Int -> a + b }
    println(lambdaFunction1(2, 3))

    var lambdaFunction2 = { msg: String ->
        println("hello Kotlin")
        println("Message is : $msg")
    }
    lambdaFunction2("Hello")
    var lambdaMinus: (Int, Int) -> Int = { x, y -> x - y }
    var unitLambda = { msg: String -> print(msg) }

    var squareLambda: (Int) -> Int = { it -> it * it }
    println("Square is : ${squareLambda(9)}")

}
*/
fun main() {
    arithmeticOperator(10, 20) { x, y -> x + y }
    arithmeticOperator(10, 20) { x, y -> x - y }
    arithmeticOperator(10, 20) { x, y -> x * y }
    arithmeticOperator(10, 20) { x, y -> x / y }
}

fun arithmeticOperator(a: Int, b: Int, fn: (Int, Int) -> Int) {
    var result = fn(a, b)
    println("Result is: $result")
}
