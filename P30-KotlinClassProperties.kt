//Execution starts from Main
fun main() {
    //Kotlin Class Properties

    //Instance of user class
    val user = User(firstName = "Alan", lastName = "Parker")
    user.printFullName() //Prints "Alan Parker"

    user.fullName = "John Smith" //Modifying name
    user.printFullName() //Prints "John Smith"

}

class User(var firstName: String, var lastName: String) {

    //Can be modified with class instance in same package
    var fullName = "$firstName $lastName"

    //Initializer block which gets executed immediately after primary constructor
    //Any number of init blocks are allowed and are executed in the order, in which they are declared
    init {
        println("Init Block 1")
        println("This class is for: $fullName")
    }

    fun printFullName() {
        println(fullName)
    }
}