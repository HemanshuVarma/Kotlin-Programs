//Execution starts from Main
fun main() {
    //Kotlin Iterating over a List with an Index with forEachIndex

    val persons: List<Person> = listOf(
            Person("James"),
            Person("Adam"),
            Person("Johny"),
            Person("Anne"),
            Person("John"),
            Person("Kevin"),
            Person("Halsey")
    )

    //Kotlin collection function, forEachIndexed exposes index of current iterating item along with data
    persons.forEachIndexed { index, person ->
        println("Index: $index, Person: $person")
    }

    /**
     * Prints:
     * Index: 0, Person: Person(name=James)
     * Index: 1, Person: Person(name=Adam)
     * Index: 2, Person: Person(name=Johny)
     * Index: 3, Person: Person(name=Anne)
     * Index: 4, Person: Person(name=John)
     * Index: 5, Person: Person(name=Kevin)
     * Index: 6, Person: Person(name=Halsey)
     */
}

data class Person(val name: String)