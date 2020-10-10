//Execution starts from Main
fun main() {
    //Kotlin requireNotNull - Forcing something that is nullable to be not null

    val name: String? = "Kotlin" //String can be nullable
    val name2: String? = null

    //Safe call. Will only check length if name is not null
    println(name?.length) //Prints 6

    //requireNotNull casts NULL to NON-NULL but throws illegalArgumentException instead of NPE
    println(requireNotNull(name2).length) //Throws NullPointerException

    //For large production codebase. This could be made user friendly by passing message in lambda
    println(requireNotNull(name2, { "This shouldn't be NULL" }).length) //Leads to crash if illegalArgumentException is not handled

    val person: Person? = null //In case, such data is coming from API and is NULL
    println(requireNotNull(person, { "Value is NULL from API" })) //Leads to crash if illegalArgumentException is not handled
}

class Person(val name: String)