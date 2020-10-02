//Execution starts from Main
fun main() {
    //Kotlin List map Operator

    val items = listOf("Bob", "Alan", "Anne", "Jay", "Jane")

    //Map returns a new list after performing specified operation on each item in list
    //Maps can also be chained with other collection functions and also with map
    val result = items.map { it.toUpperCase() }

    println(result) //Prints [BOB, ALAN, ANNE, JAY, JANE]

    val chainedMap = items.map { it.toUpperCase() }.filter { it.contains("A") }.map { it.length }

    println(chainedMap) //Prints [4, 4, 3, 4]
}