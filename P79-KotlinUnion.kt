//Execution starts from Main
fun main() {
    //Combine List into a Unique List with the union operator

    val people: List<Person> = listOf(
            Person("James"),
            Person("Adam"),
            Person("Johny"),
            Person("Anne")
    )

    val morePeople = listOf(
            Person("John"),
            Person("Kevin"),
            Person("Halsey"),
            Person("Adam") //Adding duplicate
    )

    val persons = people.union(morePeople) //Union compares and adds only unique values picked from list
    println(persons)

    //Chaining union
    val morePersons = people.union(morePeople).union(listOf(Person("James"), Person("Ellie")))
    println(morePersons)
}

data class Person(val name: String)