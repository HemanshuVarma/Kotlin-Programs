//Execution starts from Main
fun main() {
    //Nullable Types

    var name: String = "Hello"
    name = null //NULL not allowed

    var name2: String? = "Kotlin"
    name2 = null //can be NULL, as mentioned with ? symbol

    var age: Int = 7
    age = null //NULL not allowed

    var age2: Int? = 7
    age = null //Allowed

    var person: Person = Person("Varma")
    person = null //NULL not Allowed

    var person2: Person? = Person("Kotlin")
    person2 = null //Allowed

    //Kotlin does not allow a value to be NULL unless specified explicitly with "?"
}

class Person(val name: String)