fun main(vararg args: String) {

    //Welcome message to prompt user for input
    println("Please enter arithmetic problem...")

    //Reading user input
    var input = readLine()

    //Checking for user input. Shouldn't be null or empty(no blank spaces too!)
    while (!input.isNullOrEmpty()) {
        println("You entered: $input")
        input = readLine()
    }

    println("GoodBye!")
}