// Without class creating object. This feature available only in kotlin
fun main() {
    println(ABC.name)
    ABC.getName()
}
// Object Declaration
object ABC{
    val name = "ABC"
    fun getName(){
        println("Name is ABC")
    }
}
