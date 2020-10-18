//Execution starts from Main
fun main() {
    //Kotlin Type Inference

    //Compiler will automatically identify type of variable based on assigned value
    val name = "Jay"
    var age = 29

    //However, data type of variable can still be explicitly mentioned and works as normal
    val owner: String = "Keith"
    var experience: Double = 7.32

    //However, for lateinit variables type inference is mandatory as the value will be assigned in later stages and to avoid compile time error.
    lateinit var favFood: String

    //Calling a function here(nameLength) whose return type helps compiler identify data type.
    //If function doesn't have any return type then by default it is Unit(void in OOP)
    val length = nameLength(owner)
    val id = nameId(name)

    //Kotlin casts to Double to prevent loss of precision
    val result = age + experience

}

fun nameLength(name: String): Int {
    return name.length
}

fun nameId(name: String) {
    //Some operation here
}