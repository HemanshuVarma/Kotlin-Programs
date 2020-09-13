//Execution starts from Main
fun main() {
    //Kotlin Class Functions

    val user = User("John", "Franks")
    //Accessing variable directly. However, directly accessing and modifying isn't a good approach. Instead access using functions.
    println(user.fullName) //Prints "John Franks" when class variable is NOT private

    println(user.fullName()) //Calling fullName function
    println(user.fullNameLength()) //Calling fullNameLength function

    val friend = User("H", "V")
    println(friend.fullNameLength())
}

class User(var firstName: String, var lastName: String) {

    private val fullName = "$firstName $lastName"

    //Function which returns fullName. Single functions can be optimized as
    fun fullName() = fullName

    //A function can call other function too
    fun fullNameLength(): Int = fullName().length

}

/**
 * Function "fullName" is equivalent to
 *
 * fun fullName(): String {
 *    return fullName
 * }
 *
 */