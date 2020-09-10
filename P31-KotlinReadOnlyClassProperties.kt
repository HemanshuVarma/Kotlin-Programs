//Execution starts from Main
fun main() {
    //Kotlin Read-Only Class Properties

    //Instance of user class
    val user = User(firstName = "Alan", lastName = "Parker")
    user.printFullName() //Prints "Alan Parker"
    println(user.fullNameLength) //Prints 11

    user.fullName = "John Smith" //Modifying name
    user.printFullName() //Prints "John Smith"

//    user.fullNameLength = 20 //Not allowed with val

}

class User(var firstName: String, var lastName: String) {

    //Can be modified with class instance in same package
    var fullName = "$firstName $lastName"
    
    //val are Read-Only and can't be modified at later stages
    val fullNameLength = fullName.length

    //Initializer block which gets executed immediately after primary constructor
    init {
        println("Init Block")
    }

    fun printFullName() {
        println(fullName)
    }
}