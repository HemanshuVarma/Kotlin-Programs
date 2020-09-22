//Execution starts from Main
fun main() {
    //Kotlin Internal Modifier

    val vehicle = Vehicle("Black")
    val truck = Truck("White")

    vehicle.addAxle(2) //Indirect access to properties to internal class
    truck.addAxle(6)

    //Note: lateinit property isn't initialised yet to compile.
}