//Execution starts from Main
fun main() {
    //Kotlin Overriding the Setter Property

    //Instance of user class
    val user = User(firstName = "Alan", lastName = "Parker")
    println(user.fullName) //Prints "Full Name: Alan Parker"

    user.fullName = "Jon"
    println(user.fullName) //Prints "Full Name: Jon Doe"

    user.fullName = "James Doe"
    println(user.fullName) //Prints "Full Name: Jon Doe" as setter condition fails when else is omitted
                          // (as backing field is not updated)

}

class User(var firstName: String, var lastName: String) {

    var fullName = "$firstName $lastName"
        get() = "Full Name: $field" //Modifying getter to prefix with "Full Name: "
        set(value) {
            if (value.startsWith("Jon")) {
                field = "John Doe"
            } else {
                field = value
            }
        }
}