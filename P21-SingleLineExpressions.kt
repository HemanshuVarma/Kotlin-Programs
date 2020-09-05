//Execution starts from Main
fun main() {
    //Single line expressions

    val age = 7

    sayHello()

    //Single line function with If/Else
    //Good readability for single line execution
    fun checkAge() = if (age < 18) println("Not eligible") else println("Eligible")

    checkAge()
}

//Single line function
private fun sayHello() = println("Hello Dev")