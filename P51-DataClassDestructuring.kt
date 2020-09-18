//Execution starts from Main
fun main() {
    //Kotlin Data Class Destructuring

    //Instance of Person
    val person = Person(firstName = "Adam", lastName = "Parker", age = 30)

    println("Traditional way")
    println(person.component1())
    println(person.component2())
    println(person.component3())

    println("\nConcise way")
    //Destructuring data class. Each variable on LHS is assigned with variable of data class.
    //However there is no restriction on number of required values on LHS but should not exceed params in data class
    val (personFName, personLName, personAge) = person

    println(personFName)
    println(personLName)
    println(personAge)
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