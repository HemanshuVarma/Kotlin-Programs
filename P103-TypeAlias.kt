//typealias for auth token, which is of type String BTS
typealias AuthToken = String

//Execution starts from Main
fun main() {
    //Kotlin typealias - How to create a typealias in Kotlin

    //Here auth token is of type string
    val person = Person("Halsey", "LX390-JW8L1-A0EN7")

    val order = Order1(person.authToken)

}

//Here authToken which is of type string could be confusing sometimes and can be replaced by typealias which has better readability
data class Person(val name: String, val authToken: String)
//is same as
data class Person1(val name: String, val authToken: AuthToken)

data class Guardians(val firstname: String, val lastName: String, val authToken: String)
//is same as
data class Guardians1(val firstname: String, val lastName: String, val authToken: AuthToken)

data class Account(val email: String, val authToken: String)
//is same as
data class Account1(val email: String, val authToken: AuthToken)

data class Order(val authToken: String)
//is same as
data class Order1(val authToken: AuthToken)