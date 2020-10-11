//Execution starts from Main
fun main() {
    //Kotlin Type Hierarchy and Kotlin Type Checking with 'is'

    //Any is used to specify it can accept any sort of data. All the classes/primitives extends ANY.
    //Read more [https://medium.com/@m.sandovalcalvo/kotlin-type-system-unveiling-the-mystery-50613f0db893]
    val result: Any = 1_000 //Can be of any type and will be accepted.

    //Using "is" to check variable/data type
    if (result is Int) { //Checking with Any will always return true
        println("Expected type")
    } else {
        println("Unexpected type of data")
        println("It is of type: ${result.javaClass.name}")
    }
}

data class Order(val amount: Int)
class Person(name: String)
