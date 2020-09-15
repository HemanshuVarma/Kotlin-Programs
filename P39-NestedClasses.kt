//Execution starts from Main
fun main() {
    //Kotlin Nested classes

    //Instance of Vehicle
    val vehicle = Vehicle()
    vehicle.brand = "Audi" //Modifying vehicle's brand property
    println(vehicle.info()) //Prints Audi

    //Instance of VehicleColor
    val vehicleColor = Vehicle.VehicleColor()
    println(vehicleColor.info()) //Prints The vehicle color is Jet Black

    //Instance of Transmission
    val transmission = Vehicle.Transmission()
    println(transmission.info()) //Prints Automatic
}

/**
 * A simple Vehicle class
 * @property brand represent Brand of vehicle
 *
 * A class can have any number of sub-class. But scope of property is restricted between classes
 */
class Vehicle {

    var brand: String = "Unknown"

    fun info() = println(brand)

    //Class for "VehicleColor"
    class VehicleColor {
        var color = "Jet Black"

        fun info() = println("The vehicle color is $color")
    }

    //Class for "Transmission"
    class Transmission {
        var type = "Automatic"

        fun info() = println(type)
    }
}