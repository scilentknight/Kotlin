fun main() {
    var s:String = "Kotlin"
    var str: String? = null
    println(s.isPalendrome())
    if (str != null) {
//        println(str.isPalendrome())
    }
    println(str?.isPalendrome())

    var len = str?.length ?: 0 // elvis operator (?: 0) here elvis operator doing if returning null then return default value 0 insteade of null
    println("Length : $len")

    // not-null assertion operator
   // println(str!!.length) // assertion operator ensure I am 100% sure str is not-null

    // let function
    str?.let { println(it.length) } // inside let show not-full value
}