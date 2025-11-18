// An array is a data structure that holds a fixed number of values of the same type
// They are stored in contiguous memory locations
// They can be accessed programmatically though their indexes (array[1], array[0], etc.)

fun main() {
    val array1 = arrayOf(10, 1, 20, 30, 40, 50)
    var array2 = arrayOf<String>("CS", "IT", "Physics", "Chemistry")
//    print(array1.joinToString())

//    for ((i,e) in array2.withIndex()){ // along with index elements print
//        println("$i $e")
//    }

    array2[2] = "Math"
    array2.set(1,"Biology")

    println("array2[2]: ${array2[2]}")
    println(array2.get(3))
    println(array2[1])
    // OR we can use get method in an array
    println(array2.get(1))
}
