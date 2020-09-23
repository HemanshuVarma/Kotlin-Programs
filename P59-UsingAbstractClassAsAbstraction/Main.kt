//Execution starts from Main
fun main() {
    //Using Abstract Classes as an Abstraction

    //Instances
    val lambo = Lambo()
    val acura = Acura()

    //Instance has access to all the methods of TwoDoorCar and Vehicle
    driveVehicle(lambo)
    driveVehicle(acura)
}

//Taking advantage of abstract class to call it's method via the passed instance
fun driveVehicle(vehicle: Vehicle) {
    vehicle.drive()
}