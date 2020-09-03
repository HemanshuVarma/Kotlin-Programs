//Execution starts from Main
fun main() {
    //Elvis Operator

    val message: String? = "Hello Java"

    // Only executes length operation, when message is NOT NULL and returns the value
    //But, length2 could be NULL here
    val length2: Int? = message?.length

    //To ensure we don't return NULL, a Traditional approach that can be used is
    val length3: Int = if (message != null) message.length else 0 //Returns length if message is not NULL, Otherwise ZERO
    //This could be made even more concise by
    val length4: Int = message?.length ?: 0 // "?:" is Elvis operator
    //Operation is performed as usual but, when NULL is encountered, it returns Right Hand Side i.e., ZERO
}