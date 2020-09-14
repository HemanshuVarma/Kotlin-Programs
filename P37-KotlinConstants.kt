//Execution starts from Main
fun main() {
    //Constants in Kotlin

    val user = User("Adam", "Parker")

    println(user.fullName) //Prints "Adam Parker"
    println(user.printUserMinAge()) //Prints "Users age is 12"

    println(Constants.MIN_AGE) //Prints 9
    println(Constants.MAX_AGE) //Prints 18

}

class User(var firstName: String, var lastName: String) {

    //Visibility is set only to class with "private" modifier
    private val MIN_AGE = 12
    var fullName = "$firstName $lastName"

    //Accessing local constant
    fun printUserMinAge() = println("Users age is $MIN_AGE")
}

/**
 * Keyword "Object" make sures it has only ONE instance ever
 * Singletons in language like Java involves a lot of boilerplate code
 *
 * Dedicated constants file is recommended only when the variable is used in multiple places throughout the app
 *
 * Read more at [https://kotlinlang.org/docs/tutorials/kotlin-for-py/objects-and-companion-objects.html]
 */
object Constants {
    const val MIN_AGE = 9
    const val MAX_AGE = 18
}