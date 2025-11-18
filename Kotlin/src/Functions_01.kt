// Function is a block of reusable code that performs a specific task

fun main() {
    var a = 10
    var b = 30
    var add = addition(a1 = 20, a2 = 60) // named parameter
    print("Addition is: $add")
}
//fun addition(a1:Int, a2:Int):Int{ // default parameter
//    return a1 + a2
//}
// OR
fun addition(a1:Int, a2: Int) = a1+a2 // single lines function only in case of single expression to return

