//Execution starts from Main
fun main() {
    //Try/Catch/Finally in Kotlin

    val person = Person("Rick", 14)

    /**To handle app from blowing, wrapping around try/catch or try/finally or try/catch/finally can prevent this.
     * Note: Once a exception is encountered try block, execution is immediately stopped in try and starts executing catch block along with finally if present
     * catch block is optional when finally is used
     * Finally block will get executed irrespective of exception occurs or not.
     */
    try {
        println("Processing")
        checkAge(age = person.age)
        println("Success") //This is skipped when exception occurs
    } catch (exception: Exception) {
        println("Exception: $exception")
    } finally {
        //Finally is used to clean-up resources which consumes lot of memory or processes data to avoid memory leak.
        println("Finally block")
    }
    println("Out of try/catch/finally")
}

//Function to simulate execution from Server/API which may throw exception
fun checkAge(age: Int) {
    if (age < 18) {
        //Keyword 'throw' is used to stop execution of program/app immediately
        throw IllegalArgumentException("person is too young.")
    }
}

data class Person(val name: String, val age: Int)