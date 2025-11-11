fun main() {
    // Get user input for numbers and operation
    print("Enter first number: ")
    val a = readLine()?.toIntOrNull()
        ?: 0 // if user type input value is not null value then call toIntorNull() else user type input value is null or invalid like "abc" then assign a default value 0 to a

    print("Enter second number: ")
    val b = readLine()?.toIntOrNull() ?: 0

    print("Enter operation (add, sub, mul, div, mod): ")
    val operation = readLine()?.lowercase()
        ?: "" // ?: The Elvis operator. If the user input is null, it assigns an empty string "" to operation

    when (operation) {
        "add" -> println("Addition is: ${a + b}")
        "sub" -> println("Subtraction is: ${a - b}")
        "mul" -> println("Multiplication is: ${a * b}")
        "div" -> {
            if (b != 0) println("Division is: ${a / b}")
            else println("Error: Division by zero")
        }

        "mod" -> {
            if (b != 0) println("Remainder is: ${a % b}")
            else println("Error: Division by zero")
        }

        else -> println("Wrong operation specified")
    }

    println("----------------------------------------------------------")
    // OR we can assign result in a variable of above example
    var c = when (operation) {
        "add" -> a + b
        "sub" -> a - b
        "mul" -> a * b
        "div" -> if (b != 0) a / b else "Error: Divisible by zero"
        "mod" -> if (b != 0) a % b else "Error: Divisible by zero"
        else -> print("Wrong operation specified")
    }
    println("Result is: $c")

    println("----------------------------------------------------------")
    // Another example try
    print("Enter a number: ")
    var x = readLine()?.toIntOrNull() ?: 0 // if user value is not null .toIntOrNull will call else user value is zero or missmatch then value set to 0
    var w = when(x){
        10 -> println("Value is 10")
        11 -> println("Value is 11")
        in 12 until 16 -> { // in operator is like between 12 and 16 | here until operator does not include upper bound (12, 13, 14, and 15 only) | This is called range condition or statement
            println("Number is between 13 and 16")
        }
        else -> println("Not in range")
    }



}
