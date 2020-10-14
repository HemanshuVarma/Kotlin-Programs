//Execution starts from Main
fun main() {
    //Kotlin - Creating a Custom Exception

    val person = Person("Rick", 14)

    if (person.age < 18) {
        //Keyword 'throw' is used to stop execution of program/app immediately
        throw InvalidAgeException(person.age, "person is too young.")

        /**
         * throws: Exception in thread "main" InvalidAgeException: Invalid age: 14. person is too young.
         */
    }
}

data class Person(val name: String, val age: Int)

//Creating a custom exception class which extends "IllegalArgumentException"
//Note: can extend any exception class based upon requirement and type of custom exception class behaviour
class InvalidAgeException(age: Int, message: String) : IllegalArgumentException("Invalid age: $age. $message")