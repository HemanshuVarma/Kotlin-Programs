//Execution starts from Main
fun main() {
    //Class in Kotlin

    //Each instance is independent. user and friend are two instances
    val user = User(firstName = "Alan", lastName = "Parker")
    user.printFullName() //Prints Alan Parker

    //Creating instance of User
    val friend = User(firstName = "James")
    friend.printFullName() //Prints "James Smith"


}

/**
 * Class is a reusable template
 * To access variables/functions of class requires it's object(instance)
 * A class can also be accessed from separate file in same package making the code more readable
 * @param firstName is mandatory one when calling User class whereas
 * @param lastName is optional and uses default value("Smith") until passed from instance
 */
class User(var firstName: String, var lastName: String) {

    constructor(firstName: String) : this(firstName = firstName, lastName = "Smith") {
        println("Constructor 2")
    }

    //Initializer block which gets executed immediately after primary constructor
    //Any number of init blocks are allowed and are executed in the order, in which they are declared
    init {
        println("Init Block 1")
    }

    init {
        println("Init Block 2")
    }

    fun printFullName() {
        //Checking empty condition incl. blank spaces
        if (firstName.isNotBlank()) {
            println("$firstName $lastName")
        }
    }
}

/**
 * For instance "user", The primary constructor is called and init blocks are executed.
 * Thus, prints:
 * Init Block 1
 * Init Block 2
 * Alan Parker
 *
 * For instance "friend", The secondary constructor is called as lastName is not passed. So, it calls the primary constructor
 * internally and sets default value to "Smith". Once primary is executed, it executes init blocks and returns to secondary constructor.
 * Thus, prints:
 * Init Block 1
 * Init Block 2
 * Constructor 2
 * James Smith
 *
 */