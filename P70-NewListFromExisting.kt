//Execution starts from Main
fun main() {
    //Creating a New Kotlin List from an Existing Kotlin List

    //Mutable list of people
    val people = mutableListOf("Jay", "Emy")

    //Immutable list of names
    val names = listOf("James", "David", "Alan", "Frank", "Ben", "Anne", "James")

    /*//filterTo includes all the items matching predicate on top of existing mutable list
    names.filterTo(people, { it.contains("k") })
    println(people) //Prints [Jay, Emy, Frank]*/

    //filterNotTo excludes all the items matching predicate
    names.filterNotTo(people, { it.contains("a") })
    println(people) //Prints [Jay, Emy, Ben, Anne] Anne is also included as predicate is "a" which is case sensitive

}