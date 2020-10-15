//Execution starts from Main
fun main() {
    //Kotlin Try Catch Statement

    val person = Person("Rick", 14)

    //To handle app from blowing, wrapping around try/catch can prevent this.
    //Note: Once a exception is encountered try block, execution is immediately stopped in try and starts executing catch block
    try {
        println("Processing")
        checkAge(age = person.age)
        println("Success") //This is skipped as exception occurs
    } catch (exception: Exception) {
        println("Exception: $exception")
    }
}

//Function to simulate execution from Server/API which may throw exception
fun checkAge(age: Int) {
    if (age < 18) {
        //Keyword 'throw' is used to stop execution of program/app immediately
        throw Exception("person is too young.")
    }
}

data class Person(val name: String, val age: Int)