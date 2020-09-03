//Execution starts from Main
fun main() {
    //Returning value from Functions

    val x = sayHello() //Prints Hello Kotlin
    println(x) //Prints kotlin.Unit

    val y = returnString()
    println(y) //Prints Hello there!

}

//By default, a function returns "Unit" in Kotlin which is like "Void" in other programming language
fun sayHello() {
    println("Hello Kotlin")
}

//Functions can be made to return any kind of data like int, float, double, char, string etc
fun returnString(): String {
    return "Hello there!"
}