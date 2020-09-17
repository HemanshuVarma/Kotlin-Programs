//Execution starts from Main
fun main() {
    //Kotlin Data Classes

    //Each instance will point to different memory locations
    val person1 = Person("Adam", "Parker", 30)
    val person2 = Person("Adam", "Parker", 30)

    println(person1 == person2) //Prints true, as they have same structure(however memory location is different)

    println(person1.fullName()) //Prints Adam Parker
    println(person2.nameLength()) //Prints 11
}

/**
 * Data classes are used to hold data of some type in organized manner.
 * keyword "data" has be suffixed
 * It is often referred as Model class
 * Kotlin automatically generates getters, setters and other overrides out of the box
 * Whereas in Java like language requires manual setup
 *
 * Read More[https://kotlinlang.org/docs/reference/data-classes.html]
 */
data class Person(val firstName: String, val lastName: String, val age: Int) {

    fun fullName(): String {
        return "$firstName $lastName"
    }

    fun nameLength() = fullName().length
}