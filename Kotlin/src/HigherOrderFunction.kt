// Higher Order Function is a function that can take function as an argument as well as that can return function as an argument
fun main() {
    /*
    println(square(2))
    var sq = ::square // :: symbol called callable reference
    println("Square of 8 is ${sq(8)}")
    */

    var a = 10
    var b = 20
    arithmeticOpr(a, b, ::add)
    arithmeticOpr(a, b, ::sub)
    arithmeticOpr(a, b, ::mul)
    arithmeticOpr(a, b, ::div)

}

fun square(num: Int): Int {
    return num * num
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun sub(x: Int, y: Int): Int {
    return x - y
}

fun mul(x: Int, y: Int): Int {
    return x * y
}

fun div(x: Int, y: Int): Int {
    return x / y
}

fun arithmeticOpr(a: Int, b: Int, fn: (Int, Int) -> Int) {
    var result = fn(a, b)
    println("Result is: $result")
}