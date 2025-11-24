fun main() {
    var circle = Circlee()
    println(circle.area(5))
    println(circle.perimeter(4)) // extension function calling

    var str = "Madam"
    println(str.isPalendrome())
}

class Circlee {
    fun area(r: Int): Double {
        return 3.14 * r * r
    }
}
// Extension Function
fun Circlee.perimeter(r: Int): Double {
    return 2 * 3.14 * r
}

fun String.isPalendrome(): Boolean {
    return this.lowercase() == this.lowercase().reversed()
}