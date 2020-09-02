//Execution starts from Main
fun main() {
    //Structural equality

    val myName = "Ray"
    val yourName = "Joe"

    //Checks whether content is same or not
    println(myName == yourName)
    //Negated counterpart is !=

    //Checks whether content is same or not
    println(myName.equals(yourName))

    //Both, == and equals() checks for content to be same
    //Read more about Kotlin Equalities here[https://kotlinlang.org/docs/reference/equality.html]
}