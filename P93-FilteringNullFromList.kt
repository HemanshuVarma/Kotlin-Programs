//Execution starts from Main
fun main() {
    //Filter a list for Not Null Values in Kotlin with filterNotNull

    val names: List<String?> = listOf("John", "Emy", null, "Adam", "Ellie", null, "Mary")

    //Filtering out NULLs from a list with kotlin collection method
    val nonNullNames = names.filterNotNull()

    println(nonNullNames)
}