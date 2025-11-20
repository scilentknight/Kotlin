fun main() {
//   var rect:Shapes = Rectangle()
//    rect.draw()
//    var shape = Rectangle()
    // another example
    val array = arrayOf(Rectangles(), Circles(), Squares(), Triangles())
    for (shape in array) {
        shape.draw()
        shape.name()
    }
}

abstract class Shapes { // In abstract class we can define abstract methods, variables and non-abstract as well
    abstract fun draw()
    abstract fun name()
    fun type() {

    }
}

class Rectangles : Shapes() {
    override fun draw() {
        println("Drawing a Rectangle")
    }

    override fun name() {
        println("Name is Rectangle")
    }
}

class Circles : Shapes() {
    override fun draw() {
        println("Drawing a Circle")
    }

    override fun name() {
        println("Name is Circle")
    }
}

class Squares : Shapes() {
    override fun draw() {
        println("Drawing a Square")
    }

    override fun name() {
        println("Name is Square")
    }
}

class Triangles : Shapes() {
    override fun draw() {
        println("Drawing a Triangle")
    }

    override fun name() {
        println("Name is triangle")
    }
}