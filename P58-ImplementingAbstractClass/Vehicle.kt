/**
 * Class for Vehicle
 * @param color represents color of vehicle
 * @param numberOfWheels represents total number of wheels in vehicle
 * @param numberOfDoors represents total number of doors in vehicle
 *
 * Keyword "abstract" tells that, class is partially implemented functionality.
 * abstract methods have to implemented by extending Vehicle class
 *
 * Note: Abstract class cannot be initiated as they are incomplete.
 * Abstract class can be abstracted by another class
 */
abstract class Vehicle(val color: String, val numberOfWheels: Int, val numberOfDoors: Int) {

    //drive method is abstract, so it has be implemented.
    //Making it abstract because, a vehicle could have automatic or manual drive type which differs based on each vehicle.
    abstract fun drive()

    abstract fun stop()

    //This method is fully defined. So need not to be implemented.
    fun openDoors() {
        //A vehicle's opening door system will be same.
    }

    fun turnOffIgnition() {
        //A vehicle's turning off system will be same.
    }
}

//Abstract class extending another abstract class. However, this class can implement few of Vehicle's abstract methods
abstract class TwoDoorCar(color: String, numberOfWheels: Int) :
        Vehicle(color, numberOfWheels, 2) {

    //Based upon instance, Lambo's or Acura's driveFast() would be called.
    abstract fun driveFast()

    override fun drive() {
        driveFast()
    }

    override fun stop() {
        println("Stop!!!")
    }
}

class Lambo() : TwoDoorCar("Red", 4) {
    override fun driveFast() {
        println("Driving Lambo")
    }
}

class Acura() : TwoDoorCar("Silver", 4) {
    override fun driveFast() {
        println("Driving Acura")
    }
}

//Implementing abstract methods directly in class "Car"
class Car(color: String, numberOfWheels: Int, numberOfDoors: Int) :
        Vehicle(color, numberOfWheels, numberOfDoors) {
    override fun drive() {
        println("Driving Car")
    }

    override fun stop() {
        println("Stopping Car")
    }
}