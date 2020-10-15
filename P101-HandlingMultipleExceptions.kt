//Execution starts from Main
fun main() {
    //Catching Multiple Exception Types in Kotlin

    val person = Person("Rick", 14)

    //To handle app from blowing, wrapping around try/catch can prevent this.
    //Note: Once a exception is encountered try block, execution is immediately stopped in try and starts executing catch block
    try {
        println("Processing")
        checkAge(age = person.age)
        println("Success") //This is skipped as exception occurs
    } catch (exception: Exception) {

        //Handling multiple exceptions with when statements
        when (exception) {
            //Keyword 'is' referred to exception class
            is ArrayIndexOutOfBoundsException -> {
                //Handle logic here when AIOOB is thrown
                println("Index out of bounds")
            }
            is IllegalArgumentException -> println("Illegal argument exception")
            is InValidAgeException -> println("Invalid age exception")
            else -> throw exception //throwing exception when category is not known.
        }
        println("Exception: $exception")
    }
    println("Out of try/catch")
}

//Function to simulate execution from Server/API which may throw exception
fun checkAge(age: Int) {
    if (age < 18) {
        //Keyword 'throw' is used to stop execution of program/app immediately
        throw InValidAgeException("person is too young.")
    }
}

data class Person(val name: String, val age: Int)

class InValidAgeException(message: String) : IllegalArgumentException(message)