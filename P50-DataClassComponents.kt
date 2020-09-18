//Execution starts from Main
fun main() {
    //Kotlin Data Class Component1, Component2, ComponentN

    //Instance of Person
    val person1 = Person(firstName = "Adam", lastName = "Parker", age = 30)
    val person2 = Person(lastName = "Doe", age = 25, firstName = "John")

    //Components are variables of data classes represented as component1(), component2()...
    //where component1() is firstName and so on
    println(person1.component1())
    println(person1.component2())
    println(person1.component3())

    //Note: Irrespective of variables order in instance, params are aligned with classes
    println(person2.component1()) //component1 is firstName here
    println(person2.component2()) //component2 is lastName here
    println(person2.component3()) //component3 is age here
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