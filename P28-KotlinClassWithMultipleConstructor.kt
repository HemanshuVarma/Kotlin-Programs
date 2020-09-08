//Execution starts from Main
fun main() {
    //Class in Kotlin

    //Each instance is independent. user and friend are two instances
    val user = User(firstName = "Alan", lastName = "Parker")
    user.printFullName() //Prints John Mathew

    //Creating instance of User
    val friend = User(firstName = "James")
    friend.printFullName() //Prints "Name is not assigned yet"

    //Default constructor is called as all the params are supplied
    val cousin = User("John", "Mike", true)
    cousin.printFullName()

}

/**
 * Class is a reusable template
 * To access variables/functions of class requires it's object(instance)
 * A class can also be accessed from separate file in same package making the code more readable
 * @param firstName is mandatory one when calling User class whereas
 * @param lastName is optional and uses default value("smith") until passed from instance
 *
 * Respective constructors are called based upon params passed when creating object
 */
class User(var firstName: String,
           var lastName: String, val isPremiumUser: Boolean) {

    //Can have any number of constructor, but each should be unique
    constructor(firstName: String, lastName: String) : this(firstName = firstName, lastName = lastName, isPremiumUser = false)

    //This is called only when firstName is supplied. This internally calls constructor which takes firstName, lastName
    //A constructor can have body as well by enclosing code in braces "{ }"
    constructor(firstName: String) : this(firstName = firstName, lastName = "Sean")

    fun printFullName() {
        //Checking empty condition incl. blank spaces
        if (firstName.isNotBlank()) {
            println("$firstName $lastName")
        } else {
            println("Name is not assigned yet")
        }

        println("$firstName, premium holder: $isPremiumUser")
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