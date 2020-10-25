/**
 * Calculator App
 */
fun main(vararg args: String) {

    //Welcome message to prompt user for input
    println("Please enter arithmetic problem...")

    //Reading user input
    var input = readLine()

    //Checking for user input. Shouldn't be null or empty(no blank spaces too!)
    while (!input.isNullOrEmpty()) {
        //Splitting input with a space
        val values = input.split(' ')
        val lhs = values[0]
        val operator = values[1]
        val rhs = values[2]

        //Performing operation based on operator
        when (operator) {
            "+" -> println(lhs.toDouble() + rhs.toDouble())
            "-" -> println(lhs.toDouble() - rhs.toDouble())
            "*" -> println(lhs.toDouble() * rhs.toDouble())
            "/" -> println(lhs.toDouble() / rhs.toDouble())
            else -> throw IllegalArgumentException("Unknown operator: $operator")
        }

        //Continue taking input
        input = readLine()
    }

    println("GoodBye!")
}