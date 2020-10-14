//Execution starts from Main
fun main() {
    //Kotlin Generic Class - How to Create a Generic Class

    val personList = listOf(
            Person("James"), //Index 0
            Person("Emy"), //Index 1
            Person("Adam"), //Index 2
            Person("Louis"), //Index 3
            Person("Anne") //Index 4
    )
    println(EvenList(personList).evenItems()) //Prints [Person(name=James), Person(name=Adam), Person(name=Anne)]

    val programmingLanguages = listOf("Kotlin", "Java", "Python", "C++", "C")
    println(EvenList(programmingLanguages).evenItems()) //Prints [Kotlin, Python, C]
}

data class Person(val name: String)

/**
 * A generic type is a generic class or interface that is parameterized over types.
 * Essentially, generic types allows us to write a general, generic class (or method) that works with different types, allowing for code re-use.
 * T represents TYPE
 *
 * Read More[https://kotlinlang.org/docs/reference/generics.html]
 */
class EvenList<T>(private val list: List<T>) {

    //prints items at even index
    fun evenItems(): List<T> {
        return list.filterIndexed { index, value -> index % 2 == 0 }
    }
}
