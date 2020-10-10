//Execution starts from Main
fun main() {
    //Kotlin checkNotNull - Checking that a value is not null

    val person: Person? = null //In case, such data is coming from API and is NULL
    println(requireNotNull(person, { "Value is NULL from API" })) //Leads to crash if illegalArgumentException is not handled

    //requireNotNull and checkNotNull are same even with functionality. Can be used based upon convenience
    println(checkNotNull(person, { "Value is NULL from API" })) //Leads to crash if illegalArgumentException is not handled
}

class Person(val name: String)