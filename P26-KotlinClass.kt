//Execution starts from Main
fun main() {
    //Class in Kotlin

    //Each instance is independent. user and friend are two instances
    val user = User()
    user.firstName = "John"
    user.lastName = "Mathew"
    user.printFullName() //Prints John Mathew

    //Creating instance of User
    val friend = User()
    friend.printFullName() //Prints "Name is not assigned yet"

}

/**
 * Class is a reusable template
 * To access variables/functions of class requires it's object(instance)
 * A class can also be accessed from separate file in same package making the code more readable
 */
class User {
    var firstName: String = ""
    var lastName: String = ""

    fun printFullName() {
        //Checking empty condition incl. blank spaces
        if (firstName.isNotBlank() && lastName.isNotBlank()) {
            println("$firstName $lastName")
        } else {
            println("Name is not assigned yet")
        }
    }
}