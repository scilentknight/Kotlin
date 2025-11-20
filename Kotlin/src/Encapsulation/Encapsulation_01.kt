// Encapsulation : Encapsulation involves bundling data and methods that operate on that data within a single unit, known as a class
// Encapsulation can be achieved using access modifiers
// 1. public - accessible from everywhere across the module
// 2. private - accessible within its class
// 3. protected - accessible within its class as well as its subclasses
// 4. internal - accessible within a module
package Encapsulation

fun main() {
    val obj: A = A()
    obj.a
}

private fun abc() {

}

open class A { // public class
   var a = 10
    var b = 11
    protected fun xyz(){ // protected method can be accessible from subclasses
        println()
    }
}
internal class B:A(){
    fun abc(){
        super.xyz()
    }
}