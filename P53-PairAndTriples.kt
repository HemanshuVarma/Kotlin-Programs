//Execution starts from Main
fun main() {
    //Kotlin Pair and Triple Data Classes

    //Pair accepts two variables of any data type. Useful when seeking for storing two variables
    val double = Pair("Adam", "Parker") //Internally, Pair itself is data class
    println(double.first) //Prints Adam
    println(double.second) //Prints Parker

    //Triple accepts three variables
    val triple = Triple("John", 32, false)
    //Accessing via names like, first, second and third
    println(triple.first)
    println(triple.second)
    println(triple.third)
}