//Execution starts from Main
fun main() {
    //Kotlin Lambdas - Lambdas as Function Parameters

    //Syntax of lambda
    //val lambdaName: (input params) -> return type { input params -> body }

    //Calling the function
    logLines(message = "Hello World!")

    //However, this becomes complex to maintain when it's number of params are subjected to change frequently
    //Lambda can be utilised her to overcome this caveat

    loggerLines {
        //Block of code here
        println("Hello Kotlin")
        println("Hello Java")
        //Much flexible than function with params
    }
}

/**
 * Traditional way
 *
 * To print few line separators before and after message
 * @param message actual message to be surrounded by separators
 */
fun logLines(message: String) {
    repeat(1) { println("--------") }
    println(message) //Print the message
    repeat(1) { println("--------") }
}

/**
 * Kotlin's Lambda approach
 *
 * To print few line separators before and after message
 * @param block is name of lambda whose params are none and return type is Unit(void in java)
 */
fun loggerLines(block: () -> Unit) {
    repeat(1) { println("********") }
    block() //execute block of code present in lambda
    repeat(1) { println("********") }
}