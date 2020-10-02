//Execution starts from Main
fun main() {
    //Combining Multiple Immutable Lists in Kotlin

    //Creating multiple lists of strings
    val listA: List<String> = listOf("Apple", "Blue berry", "Guava")
    val listB: List<String> = listOf("Grapes", "Papaya")
    val listC: List<String> = listOf("Mango", "Strawberries")

    //Combining created list above
    val finalList: List<List<String>> = listOf(listA, listB, listC)
    //Prints list with multiple inner list
    println(finalList) //Prints [[Apple, Blue berry, Guava], [Grapes, Papaya], [Mango, Strawberries]]

    //Printing flatten list
    println(finalList.flatten()) //Prints [Apple, Blue berry, Guava, Grapes, Papaya, Mango, Strawberries]

    //ANOTHER ALTERNATE, WITHOUT USING FLATTEN.

    val result = listA.plus(listB).plus(listC) //plus returns a new list
    println(result)

    //Similarly, any item or list can be removed by
    println(result.minus(listB).minus("Blue berry")) //Prints [Apple, Guava, Mango, Strawberries]

}