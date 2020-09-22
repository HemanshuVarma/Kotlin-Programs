/**
 * Class Axle, representing Axles of a vehicle
 * Visibility modifier "internal" restricts the visibility within same Module and not anywhere else outside
 *
 * Read More[https://kotlinlang.org/docs/reference/visibility-modifiers.html]
 */
internal class Axle(numberOfWheels: Int) {
    // Axle Implementation...
}

open class Vehicle(color: String) {

    private lateinit var axle: MutableList<Axle>

    fun addAxle(numberOfWheels: Int) {
        axle.add(Axle(numberOfWheels))
    }
}

class Truck(color: String) : Vehicle(color) {
    init {
        addAxle(2)
        addAxle(4)
    }
}