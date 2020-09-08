//Execution starts from Main
fun main() {
    //Class in Kotlin

    //Each instance is independent. user and friend are two instances
    val user = User("Alan", "Parker")
    user.printFullName() //Prints John Mathew

    //Creating instance of User
    val friend = User("James")
    friend.printFullName() //Prints "Name is not assigned yet"

}

/**
 * Class is a reusable template
 * To access variables/functions of class requires it's object(instance)
 * A class can also be accessed from separate file in same package making the code more readable
 * @param firstName is mandatory one when calling User class whereas
 * @param lastName is optional and uses default value("smith") until passed from instance
 */
class User(var firstName: String,
           var lastName: String = "Smith") {

    fun printFullName() {
        //Checking empty condition incl. blank spaces
        if (firstName.isNotBlank()) {
            println("$firstName $lastName")
        } else {
            println("Name is not assigned yet")
        }
    }
}

/**
 * Note:
 * class User(var firstName: String, var lastName: String = "Smith")
 * is equivalent to
 * class User constructor(var firstName: String, var lastName: String = "Smith")
 *
 * Constructor is simply initializes object for the class and has the same name as of class.
 * Read More: [https://beginnersbook.com/2013/03/constructors-in-java/]
 */