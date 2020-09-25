//Execution starts from Main
fun main() {
    //Creating a List in Kotlin

    //Creating list of strings. Note: listOf() is kotlin's inline function which reduces boilerplate code.
    //Note: List's are read only once initialised
    val items = listOf("Kotlin", "Java", "Python")

    //Iterating over each item in List. Again, forEach is kotlin's shorthand for iteration in collections.
    items.forEach {
        println(it) //it is default, which represents current item
    }

    //Adding new item to current list
    val updatedItems = items.plus("C++")

    updatedItems.forEach { println(it) }

    //Storing custom data in list
    val users = arrayOf(User("Adam", "Parker"), User("John", "Doe"))

    users.forEach { println(it) }

    val updatedUsers = users.plus(User("Will", "Jason"))

    updatedUsers.forEach { println(it) } //Printing with updated user data

    //Getting first and last item of list
    val first = updatedUsers.first()
    val last = updatedUsers.last()

    println(first) //Prints Adam Parker which is the first item
    println(last) //Prints Will Jason which is the last item

    if (items.isNullOrEmpty()) println("Empty or Null") else println("Has items")
}

class User(var firstName: String, var lastName: String) {

    fun fullName() = "$firstName $lastName"

    override fun toString() = fullName()
}