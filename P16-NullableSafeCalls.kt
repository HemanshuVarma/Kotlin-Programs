//Execution starts from Main
fun main() {
    //Nullable Safe Calls

    val message = "Hello Kotlin"
    val length = message.length // Returns length for sure as it can't be NULL

    println(length)

    val message1: String? = "Hello Java"
    val length2 = message1?.length // Only executes length operation, when message1 is NOT NULL and returns the value

    //Traditional approach
    val length3 = if (message1 != null) length else 0 //Returns length if message1 is not NULL, Otherwise ZERO
    //This could be made even more concise by
    val length4 = message1?.length ?: 0 // "?:" is Elvis operator

    //Chaining is also possible
    val length5 = message1?.subSequence(0, 7)?.drop(4)?.length
    //Each operation is performed if it is not NULL, Otherwise returns NULL

    println(length)
}