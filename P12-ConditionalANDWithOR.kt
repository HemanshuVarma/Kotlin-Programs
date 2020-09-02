//Execution starts from Main
fun main() {

    val myAge = 7
    val yourAge = 8

    val myName = "John"
    val yourName = "Joe"

    // Conditional AND(&&)
    // && checks for ALL conditions to be true
    if ((myAge == yourAge) && (myName != yourName)) {
        println("Executed only when conditions were true")
    } else {
        println("Condition not matched with &&")
    }

    // Conditional OR(||)
    // || checks for ANY ONE condition out of all to be true
    if ((myAge == yourAge) || (myName != yourName)) {
        println("Executed only when conditions were true")
    } else {
        println("Condition not matched with ||")
    }

    // Conditional AND(&&) can also be used with Conditional OR(||)
    if ((myAge != yourAge) || (myName == yourName) && (myName.length != yourName.length)) {
        println("Executed only when any of OR condition were true along with &&")
    } else {
        println("Condition not matched either with || or &&")
    }
}