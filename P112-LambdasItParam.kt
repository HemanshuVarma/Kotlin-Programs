//Execution starts from Main
fun main() {
    //Kotlin Lambdas - The 'it' parameter

    //Syntax of lambda
    //val lambdaName: (input params) -> return type { input params -> body }

    //Kotlin's helper function "repeat" itself is a lambda which has only one input variable i.e., index.
    //For better readability, single valued lambda's can use "it" instead
    //index for repeat starts from 0 (zero)
    repeat(10) { println("Index is $it") }
}