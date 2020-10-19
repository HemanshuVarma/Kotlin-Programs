//Execution starts from Main
fun main() {
    //Kotlin Lambdas - Passing Values to Lambda Expression Function Parameters

    //Syntax of lambda
    //val lambdaName: (input params) -> return type { input params -> body }

    loggerLines(2) { currentIndex ->
        println("Current Index is $currentIndex")
    }

    welcomeUser("Peter") { user -> //Exposed value by lambda
        "Hello $user" //Returning string to lambda
    }
}

/**
 * Kotlin's Lambda approach
 *
 * To print few line separators before and after message
 * @param times is the number of times for repeating
 * @param block is name of lambda whose params are integer and return type is Unit(void in java)
 * Exposing lambda value with calling Line Of Code
 */
fun loggerLines(times: Int, block: (Int) -> Unit) {
    repeat(times) { index -> //index is current value of iteration provided by kotlin standard library
        block(index) //passing the current index to block
    }
}

/**
 * @param name passed to lambda
 * @param block takes in string and returns a string
 */
fun welcomeUser(name: String, block: (String) -> String) {
    println("Length of name is: ${name.length}")
    println(
            block(name) //calls code of lambda and executes it
    )
}