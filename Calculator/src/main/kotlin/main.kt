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

        //Checking for single input, or expression without space
        if (values.size < 3) {
            println("Expecting formatted input: VALUE OPERATOR VALUE. Found: ${values[0]}")
        } else {
            val lhs = values[0].toDoubleOrNull() ?: throw IllegalArgumentException("Invalid input format ${values[0]}")
            val operator = values[1]
            val rhs = values[2].toDoubleOrNull() ?: throw  IllegalArgumentException("Invalid input format ${values[2]}")

            //Performing operation based on operator
            val result = when (operator) {
                "+" -> lhs + rhs
                "-" -> lhs - rhs
                "*" -> lhs * rhs
                "/" -> lhs / rhs
                else -> throw IllegalArgumentException("Unknown operator: $operator")
            }
            println(result) //Prints result
        }
        //Continue taking input
        input = readLine()
    }

    //Printing thanking message before exiting program
    println("GoodBye!")
}