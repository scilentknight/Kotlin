fun main() {
    // Arithmetic Operator
    val a = 15
    val b = 4

    println("Arithmetic Operator Example")
    println("Addition ($a+$b) = ${a+b}")
    println("Subtraction ($a-$b) = ${a-b}")
    println("Multiplication ($a*$b) = ${a*b}")
    println("Division ($a/$b) = ${a/b.toFloat()}")
    println("Modulus ($a%$b) = ${a%b}")

    // Assignment Operator
    var x = 10

    println("Assignment Operator Example")
    x+=10
    println("x+=10 = $x")

    x-=10
    println("x-=10 = $x")

    x*=10
    println("x*=10 = $x")

    x/=10
    println("x/=10 = $x")

    x%=10
    println("x%=10 = $x")

    // Relational Operator
    val i = 10
    val j = 20

    println("Relational Operator Example")
    println("i<j:${i<j}")
    println("i>j:${i>j}")
    println("i<=j:${i<=j}")
    println("i>=j:${i>=j}")
    println("i==j:${i==j}")
    println("i!=j:${i!=j}")

    // Logical Operator
    val l = 10
    val m = 20
    val n = 30

    println("Logical Operator Example")
    println("l<m && n<m:${l<m && n<m}")
    println("l<m || n<m:${l<m || n<m}")
    println("!(l<m):${!(l<m)}")

    // Unary(Increment/Decrement) Operator
    var v = 10
    println("Unary (Increment/Decrement) Operator Example")
    println("v:$v")
    println("++v:${++v}")
    println("v++:${v++}")
    println("v:$v")
    println("--v:${--v}")
    println("v--:${v--}")
    println("v:$v")

}