//Execution starts from Main
fun main() {
    //Filtering a List in Kotlin

    //Immutable list of names
    val names = listOf("James", "David", "Alan", "Frank", "Ben", "Anne")

    println(names) //Prints [James, David, Alan, Frank, Ben, Anne]

    //Using a filter collection
    val filteredNames = names.filter {
        //Logic here
        it.endsWith("n", true)
    }

    println(filteredNames) //Prints [Alan, Ben]

    val ages = listOf(23, 48, 13, 56, 77, 9)

    val adults = ages.filter(::isChild) //Filters items, whose age is less than 18

    println(adults)
}

fun isChild(age: Int) = age <= 18

//is equivalent to
fun isChildAlternate(age: Int): Boolean {
    //Preferred when logic is complex
    return age <= 18
}