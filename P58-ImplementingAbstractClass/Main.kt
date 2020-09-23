//Execution starts from Main
fun main() {
    //Implement an Abstract Class in Kotlin

    //Instances
    val car = Car("white", 4, 4)
    val lambo = Lambo()
    val acura = Acura()

    //All the vehicle class, implementation is accessible in addition to abstract implementation
    car.drive()
    car.stop()
    car.openDoors()
    car.turnOffIgnition()

    //Instance has access to all the methods of TwoDoorCar and Vehicle
    lambo.drive()
    lambo.driveFast()

    acura.drive()
    acura.driveFast()
}