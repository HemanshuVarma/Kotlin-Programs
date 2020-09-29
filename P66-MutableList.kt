//Execution starts from Main
fun main() {
    //Creating Mutable Lists in Kotlin

    //A list whose value can be altered at later stages
    val items = mutableListOf<Int>(1, 2, 3, 4, 5)
    items.forEach { println(it) }

    println("-")
    //Adding item to list
    items.add(6)

    //Remove item at index
    items.removeAt(2) //Removes "3"

    //Remove specific item from mutable list
    items.remove(5) //Removes "5"

    items.forEach { println(it) }

    val users = mutableListOf<User>(User("Alan", "Parker"), User("John", "Doe"))

    println("-")

    users.forEach { println(it) }

    users.add(User("Paul", "Jr"))

    //Printing data using index position
    println(users[2])
}

class User(var firstName: String, var lastName: String) {

    fun fullName() = "$firstName $lastName"

    override fun toString() = fullName()
}