//Execution starts from Main
fun main() {
    //Kotlin Overriding the Getter Property

    //Instance of user class
    val user = User(firstName = "Alan", lastName = "Parker")

    println(user.fullName) //Prints Full Name: Alan Parker

}

class User(var firstName: String, var lastName: String) {

    var fullName = "$firstName $lastName"
        get() = "Full Name: $field" //Modifying getter to prefix with "Full Name: "
    //Note: field in getter is backing property of variable fullName
}