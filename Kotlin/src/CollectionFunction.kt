import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    var list = listOf("MSC", "Madam", "civic", "CS", "radar")

//    var palindromeStrings = list.filter(::isPalindrome)
    // or
    /*
    var palindromeStrings = list.filter(fun(str: String): Boolean {
        return str.lowercase() == str.lowercase().reversed()
    })
    */
    // or
    var palindromeStrings = list.filter({ isPalindrome(it) })
    println(palindromeStrings)

    println("-----------------------")
    var upperList = list.map { it.uppercase(getDefault()) }
    println(upperList)

    println("-----------------------")
    list.forEach { println(it) }

    println("-----------------------")
    println("Total entries : ${list.count()}")
}

fun isPalindrome(str: String): Boolean {
    return str.lowercase() == str.lowercase().reversed()
}