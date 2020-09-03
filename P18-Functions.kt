//Execution starts from Main
fun main() {
    //Functions

    println("Hello World")
    purpleCow()
    blueCow()
}

/**
 * Functions are intended to perform some task which needs to be executed 'n' times
 * Basically, a common tasks through out the program are separated to function
 * Public functions can be called from any portion of the code, making sure not to loop them forever
 */
fun purpleCow() {
    println("Purple Cow")
    blueCow()
}

/**
 * Function naming is done in CamelCase like helloWorld, myFirstProgram
 */
fun blueCow() {
    println("Blue Cow")
}