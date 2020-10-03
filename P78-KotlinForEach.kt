//Execution starts from Main
fun main() {
    //Kotlin forEach Collection Iteration

    val people: List<Person> = listOf(
            Person("James"),
            Person("Adam"),
            Person("Johny"),
            Person("Anne")
    )

    //forEach is kotlin's idiomatic way and part of Kotlin Collection Functions
    people.map { it.name }
            .map { it.toUpperCase() } //map returns new list after applying specified operation
            .forEach { println(it.reversed()) } //Prints names in upperCase and in reverse
}

data class Person(val name: String)