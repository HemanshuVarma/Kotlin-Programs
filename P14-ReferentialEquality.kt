//Execution starts from Main
fun main() {
    //Referential equality

    val myAge = 5
    val yourAge = 6

    //Checks whether variables refer to same memory object or not
    //For primitives data types like int, char and boolean, === and == acts same
    println(myAge === yourAge)
    //Negated counterpart is !==

    val a = Person("Kotlin")
    val b = Person("Kotlin")

    //Checks whether they point to same memory or no.
    println(a === b) //Prints false, as each Object is initialized in different locations

    //Read more about Kotlin Equalities here[https://kotlinlang.org/docs/reference/equality.html]
}

class Person(val name: String)