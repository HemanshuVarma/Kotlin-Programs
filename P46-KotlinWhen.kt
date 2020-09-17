//Execution starts from Main
fun main() {
    //Kotlin Conditionals - The Kotlin when statement

    //Instance of User class
    val user = User("Adam", "Parker")

    //when conditional is similar to Java's "switch" statements
    //Based upon the condition, comparison happens and matched result is executed. Otherwise, else block is executed
    when (user.firstName) {
        "Adam" -> println("Hello Adam!")
        "Jane" -> println("Hello Jane")
        else -> println("Oops! Couldn't identify")
    }

    //Below type is another form of when. Such approach can be put to use when having lengthy condition
    //For instance, user.firstName == "Adam" && user.lastName == "Parker"
    when {
        user.firstName == "Adam" -> {
            println("Hello Adam!")
            //Multiple line logic, operation
        }
        user.firstName == "Jane" -> println("Hello Jane")
        else -> println("Oops! Couldn't identify")
    }

}

class User(var firstName: String, var lastName: String) {

    private fun fullName() = "$firstName $lastName"

    override fun toString(): String {
        return fullName()
    }
}