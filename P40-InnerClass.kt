//Execution starts from Main
fun main() {
    //Kotlin Inner classes

    //Instance of Vehicle
    val vehicle = Vehicle()
    vehicle.brand = "Audi" //Modifying vehicle's brand property
    println(vehicle.info()) //Prints Audi

    //Instance of inner classes is possible by parent's instance.
    val vehicleColor = vehicle.VehicleColor()
    println(vehicleColor.info()) //Prints The color of your Audi is Jet Black

    //Instance of inner classes is possible by parent's instance.
    val transmission = vehicle.Transmission()
    println(transmission.info()) //Prints Automatic
}

/**
 * A simple Vehicle class
 * @property brand represent Brand of vehicle
 *
 * A class can have any number of sub-class.
 * Note: Once a nested class is marked "inner", Scope of properties is within parent class.
 */
class Vehicle {

    var brand: String = "Unknown"

    fun info() = println(brand)

    //Class for "VehicleColor"
    inner class VehicleColor {
        var color = "Jet Black"

        fun info() = println("The color of your $brand is $color")
    }

    //Class for "Transmission"
    inner class Transmission {
        var type = "Automatic"

        fun info() = println(type)
    }
}