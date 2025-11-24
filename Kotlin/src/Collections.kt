// A collection usually contains a number of objects of the same type(ans its subtypes).
// Types of collections in kotlin
// 1. List : List is an ordered collection with access to elements by indices. Order matter
// 2. Set : Set is a collection of unique elements. no replication of object. Order doesn't matter
// 3. Map (Dictionary) : Map is a set of key value pairs. Keys are unique, and each of them maps to exactly one value.

// List
/*
fun main() {
    var list = listOf(1, 3, 5, 7) // immutable list
    var mutableList = mutableListOf(10, 12, 6, 13)
    println(list)
    println(list.contains(7)) // true
    println(list.get(2))
    // or
    println(list[2])

    println(mutableList)
    mutableList.set(1, 18)
    // or
    mutableList[1] = 18
    println(mutableList)

    println("--------------------------------------------")

    var list1 = listOf(0, 2, 3, 4)
    mutableList.addAll(list1)
    println(mutableList)
}
*/

// Set
/*
fun main() {
    val subjectSet = setOf("CS", "Physics", "Maths", "CS", "Physics") // Not allowed duplicate entries
    println(subjectSet)
    println(subjectSet.contains("Physics")) // true
    println(subjectSet.elementAt(2))
    val subjectSet2 = mutableSetOf("CS", "Physics", "Maths", "CS", "Physics") // Not allowed duplicate entries
    subjectSet2.add("English")
    println(subjectSet2)
    subjectSet2.remove("Physics")
    println(subjectSet2)
}

*/

// Map
fun main() {
    var map = mapOf(1 to "Noraly", 2 to "Raman", 3 to "Mandip", 3 to "Rohit") // key should be unique
    println(map)
    println(map.get(2))
    println("--------------------------")
    var mutableMap = mutableMapOf<Int, String>()
    mutableMap.put(1, "Ashok")
    mutableMap.put(2, "Bikash")
    mutableMap.put(3, "Ajit")
    println(mutableMap)

    mutableMap.replace(3, "Anshu")
    println(mutableMap)

//    mutableMap.remove(3)
//    println(mutableMap)

    // Iteration on map
    for ((key,value) in mutableMap){
        println("$key:$value")
    }
}