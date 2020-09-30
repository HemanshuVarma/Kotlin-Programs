//Execution starts from Main
fun main() {
    //Kotlin FilterNot on a List

    //Immutable list of names
    val names = listOf("James", "David", "Alan", "Frank", "Ben", "Anne", "James")

    //filter includes all the items matching predicate
    val filterResult = names.filter { it.contains("a") }
    println(filterResult) //Prints [James, David, Alan, Frank, James]

    //filterNot excludes all the items matching predicate
    val filterNotResult = names.filterNot { it.contains("a") }
    println(filterNotResult) //Prints [Ben, Anne]

}