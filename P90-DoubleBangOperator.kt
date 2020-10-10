//Execution starts from Main
fun main() {
    //Kotlin Double Bang Operator !!

    val name: String? = "Kotlin" //String can be nullable
    val name2: String? = null

    //Safe call. Will only check length if name is not null
    println(name?.length) //Prints 6

    //Double bang(!!) says it won't be null anytime and throws NPE in case if it's null.
    println(name2!!.length) //Throws NullPointerException

    val person: Person? = null //In case, such data is coming from API and is NULL
    println(person) //Leads to crash

    //Note: Using !! in production application is risky, as it blow whole application with crash.
}

class Person(val name: String)