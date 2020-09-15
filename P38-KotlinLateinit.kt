//Execution starts from Main
fun main() {
    //lateinit in Kotlin

    val user = User("Adam", "Parker")
    user.favouriteColor = "Purple" //Modifying lateinit property
    println(user.toString()) //Prints Adam Parker's favourite color is Purple

}

class User(var firstName: String, var lastName: String) {

    //lateinit refers to late initialization. These are suitable when we don't want to initialize variable immediately with some value.
    //Note: lateinit variables has to be initialized before they're accessed anywhere. Otherwise "UninitializedPropertyAccessException" will be thrown
    lateinit var favouriteColor: String

    private fun fullName() = "$firstName $lastName"

    override fun toString(): String {
        return fullName() + "'s favourite color is $favouriteColor"
    }

}