//Execution starts from Main
fun main() {
    //Copying Kotlin Data Classes

    //Instances
    val person1 = Person(firstName = "Adam", lastName = "Parker", age = 30)

    //Shallow copy of all the content of person1 data class.
    //Read here [https://stackoverflow.com/questions/47359496/kotlin-data-class-copy-method-not-deep-copying-all-members]
    val person2 = person1.copy(firstName = "John", age = 25) //Modifying only required data

    println(person1)
    println(person2)

    val order = Order(orderAmount = 100, customer = person1)

    println(order)
    println(order.copy(orderAmount = 250)) //Modifying only order amount
    println(order.copy(customer = person2)) //Modifying customer with person2


}

/**
 * Data classes are used to hold data
 * Read More[https://kotlinlang.org/docs/reference/data-classes.html]
 */
data class Person(
        val firstName: String,
        val lastName: String,
        val age: Int,
)

data class Order(
        val orderAmount: Int,
        val customer: Person,
)