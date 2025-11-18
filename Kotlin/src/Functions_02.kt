//fun main(){
//    var num1 = 10
//    var num2 = 20
//    add(num1,num2)
//
//}
//fun add(a:Int, b:Int){
//    print(a+b)
//}

// another way

fun main() {
    var num1 = 10
    var num2 = 50
//    var add = ::sum
//    print(add(2,5))
    // function overloading
    var add = sum(4,5,6)
    print("Addition is: $add")
}
fun sum(a:Int, b: Int): Int{
    return a+b
}
fun sum(a:Int, b: Int, c:Int): Int{
    return a+b+c
}