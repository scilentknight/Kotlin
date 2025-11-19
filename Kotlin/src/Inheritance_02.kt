fun main() {
    var car = Car("Yellow") // Note - when creating an object of child class it autometically create parent class object as well and when we call first parent class invoke
    println(car.name)
    car.drive()
    println(car.color)
}
open class Vehicle(var color:String){
    init{
        println("Vehicle class created")
    }
    open var name = "Vehicle" // open declared for make this property (name) able to override by child classes
    open fun drive(){
        println("Vehicle is driving")
    }
}
class Car(carColor: String):Vehicle(carColor){
    init{
        println("Car class created")
    }
    override var name = "Car" // base class property (name) override in child class
    override fun drive(){
        super.drive() // Vehicle is driving
        println("Car is driving")
    }
}