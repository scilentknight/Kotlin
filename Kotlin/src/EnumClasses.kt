// Enum Class : we use when we know possible objects of the class
fun main() {
    val dir = Directions.East
    println(dir.num)
    println(dir.name)
    println(dir.ordinal) // return position
    println("----------------------------")
    for(i in Directions.entries){
        println(i.name)
    }
    dir.printDirectionName()
}

enum class Directions(val num: Int){
    East(1),
    West(2),
    North(3),
    South(4);

    fun printDirectionName(){
        println("Name of the direction is $this.")
    }
}