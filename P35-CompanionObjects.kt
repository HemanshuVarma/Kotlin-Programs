//Execution starts from Main
fun main() {
    //Kotlin Class Functions

    val user = User.createUser("Adam", "Parker")
    println(user)

    //Creating a list of 5 users
    val users = User.createUsers(5)
    users.forEach {
        println(it)
    }
}

class User(var firstName: String, var lastName: String) {

    companion object {

        private val users = mutableListOf<User>()

        //Returns a single user
        fun createUser(firstName: String, lastName: String): User {
            return User(firstName, lastName)
        }

        //Returns a list of users
        fun createUsers(count: Int): List<User> {
            for (i in 1..count) {
                users.add(User("FirstName $i", "LastName $i"))
            }
            return users
        }
    }

    private fun fullName() = "$firstName $lastName"

    override fun toString(): String {
        return fullName()
    }
}