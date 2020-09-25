//Execution starts from Main
fun main() {
    //Creating Arrays in Kotlin

    //Creating array of strings. Note: arrayOf() is kotlin's inline function which reduces boilerplate code.
    val items = arrayOf("Kotlin", "Java", "Python")

    //Iterating over each item in Array. Again, forEach is kotlin's shorthand for iteration in collections.
    items.forEach {
        println(it) //it is default, which represents current item
    }

    //Adding new item to current array
    val updatedItems = items.plus("C++")

    updatedItems.forEach { println(it) }

    //Storing custom data in array
    val users = arrayOf(User("Adam", "Parker"), User("John", "Doe"))

    users.forEach { println(it) }

    val updatedUsers = users.plus(User("Will", "Jason"))

    updatedUsers.forEach { println(it) } //Printing with updated user data

    /**
     * Similarly, kotlin provides various out of the box functions which can be utilised for other data types.
     * Like - doubleArrayOf(), floatArrayOf(), longArrayOf(), intArrayOf(), charArrayOf(),
     * shortArrayOf(), byteArrayOf(), booleanArrayOf() etc...
     */

}

class User(var firstName: String, var lastName: String) {

    fun fullName() = "$firstName $lastName"

    override fun toString() = fullName()
}