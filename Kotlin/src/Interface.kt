fun main() {
//   var rect:Shapes = Rectangle()
//    rect.draw()
//    var shape = Rectangle()
    // another example
    val array = arrayOf(Rectangless(), Circless(), Squaress(), Picture())
    for (shape in array) {
        shape.name()
    }
}

abstract class Shapess : Name, XYZ { // In abstract class we can define abstract methods, variables and non-abstract as well
    abstract fun draw()
    fun type() {

    }
}

// Interface
interface Name {
    fun name()
}

interface XYZ {
    fun xyz()
}

class Rectangless : Shapess() {
    override fun draw() {
        println("Drawing a Rectangle")
    }

    override fun name() {
        println("Name is Rectangle")
    }

    override fun xyz() {
        TODO("Not yet implemented")
    }
}

class Circless : Shapess() {
    override fun draw() {
        println("Drawing a Circle")
    }

    override fun name() {
        println("Name is Circle")
    }

    override fun xyz() {
        TODO("Not yet implemented")
    }
}

class Squaress : Shapess() {
    override fun draw() {
        println("Drawing a Square")
    }

    override fun name() {
        println("Name is Square")
    }

    override fun xyz() {
        TODO("Not yet implemented")
    }
}

class Picture : Name {
    override fun name() {
        println("Name is Picture")
    }
}

