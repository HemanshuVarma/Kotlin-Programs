//Execution starts from Main
fun main() {
    //Finding Items in a Kotlin List

    //Immutable list of names
    val names = listOf("James", "David", "Alan", "Frank", "Ben", "Anne", "James")

    //Utilising kotlin collection methods
    //"find" returns value if found. Othwerwise, null
    val result = names.find { it == "Jan" }
    println(result)

    //Returns first matching item
    val result1 = names.firstOrNull { it == "James" }
    val result2 = names.lastOrNull { it == "James" }
    val result3 = names.indexOfFirst { it == "James" }
    val result4 = names.indexOfLast { it == "James" }

    println(result1) //Prints James
    println(result2) //Prints James
    println(result3) //Prints 0
    println(result4) //Prints 6
}