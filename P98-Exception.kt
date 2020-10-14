//Execution starts from Main
fun main() {
    //Throwing an Exception in Kotlin

    val person = Person("Rick", 14)

    if (person.age < 18) {
        //Keyword 'throw' is used to stop execution of program/app immediately
        throw Exception("person is too young.")

        /**
         * throws
         * Exception in thread "main" java.lang.Exception: person is too young.
         *
         * Where Exception is type alias of java's exception and a generic one.
         * Appropriate exceptions can be used based on error type
         */
    }
}

data class Person(val name: String, val age: Int)