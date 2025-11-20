fun main() {
    var obj = object:Type{
        val name = "BCA"
        fun getName(){
            println("Name is BCA")
        }

        override fun type() {
            println("This is an anonymous object")
        }
    }
    println(obj.name)
    obj.type()
}

object BCA{
    val name = "BCA"
    fun getName(){
        println("Name is BCA")
    }
}

interface Type{
    fun type()
}