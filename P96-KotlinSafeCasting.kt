//Execution starts from Main
fun main() {
    //Kotlin Safe Casting

    //Any is used to specify it can accept any sort of data. All the classes/primitives extends ANY.
    //Read more [https://medium.com/@m.sandovalcalvo/kotlin-type-system-unveiling-the-mystery-50613f0db893]
    val result: Any = getDataFromAPI(7) //Can be of any type and will be accepted.

    //as is used to cast from one type to another.
    val castedData = result as? String //Casting to other type will lead to ClassCastException.  To avoid this, as can be appended with ? operator which returns null if type doesn't match
    println(castedData)
}

fun getDataFromAPI(value: Any): Any {
    return when (value) {
        1 -> 777
        2 -> "Emy"
        3 -> 91.6
        4 -> true
        5 -> Person("Anne")
        else -> "UNDEFINED"
    }
}

class Person(name: String)
