import java.text.NumberFormat

fun main() {
    try {
        var a = "abc".toInt()
    } catch (e: NumberFormatException) {
        println("String can not be converted to number because of ${e.message}")
    } catch (e: Exception) {
        println("String can not be converted")
    } finally {
        println("I will execute everytime")
    }
    isEven(3)
    println("Processing done")
}

fun isEven(num: Int) {
    try {

        if (num % 2 !== 0) {
            throw IllegalArgumentException("Number is not even")
        }
    } catch (e: IllegalArgumentException){
        println("Error: ${e.message}")
    }
}