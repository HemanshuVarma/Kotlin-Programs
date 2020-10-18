//Execution starts from Main
fun main() {
    //Kotlin Lambdas - Understanding Simple Lambda Expressions

    //Lambda is a part of Higher Order Function. This helps in having a anonymous function adn function inside of function
    //val lambdaName: (input params) -> return type { input params -> body }

    val greet: (String) -> String = { fullName: String ->
        val uppercaseFullName = fullName.toUpperCase()
        "HELLO $uppercaseFullName" //last line of lambda is always the return value if defined
    }
    println(greet("Adam Parker")) //Prints HELLO ADAM PARKER

    //Lambda with multiple params
    val greeting: (String, String) -> Unit = { firstName: String, lastName: String ->
        println("Hola, $firstName $lastName")
    }

    greeting("Emy", "Parker") //Prints Hola, Emy Parker

    //However type inference is not mandatory for simple logic, but a good practice make lambda strongly typed.
    //This is useful, in order to avoid populating wrong data type and blowing up application when feeding a server data in lambda
    val wish = { userName: String ->
        println("Welcome $userName")
    }

    wish("James") //Prints Welcome James
}