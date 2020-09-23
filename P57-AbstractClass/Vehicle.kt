/**
 * Class for Vehicle
 * @param color represents color of vehicle
 * @param numberOfWheels represents total number of wheels in vehicle
 *
 * Keyword "abstract" tells that, class is partially implemented functionality.
 * abstract methods have to implemented by extending Vehicle class
 *
 * Note: Abstract class cannot be initiated as they are incomplete
 */
abstract class Vehicle(val color: Int, val numberOfWheels: Int) {

    //drive method is abstract, so it has be implemented.
    //Making it abstract because, a vehicle could have automatic or manual drive type which differs based on each vehicle.
    abstract fun drive()

    //This method is fully defined. So need not to be implemented.
    fun openDoors() {
        //A vehicle's opening door system will be same.
    }

    fun turnOffIgnition() {
        //A vehicle's turning off system will be same.
    }
}