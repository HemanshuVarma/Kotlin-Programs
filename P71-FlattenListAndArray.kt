//Execution starts from Main
fun main() {
    //Flatten a List or an Array in Kotlin

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

    //Creating multiple array of strings
    val arrayA: Array<String> = arrayOf("Apple", "Blue berry", "Guava")
    val arrayB: Array<String> = arrayOf("Grapes", "Papaya")
    val arrayC: Array<String> = arrayOf("Mango", "Strawberries")

    //Combining created array above
    val finalArray: Array<Array<String>> = arrayOf(arrayA, arrayB, arrayC)
    //Prints array with multiple inner array of strings
    println(finalArray) //Prints [[Apple, Blue berry, Guava], [Grapes, Papaya], [Mango, Strawberries]]

    //Printing flatten array
    println(finalArray.flatten()) //Prints [Apple, Blue berry, Guava, Grapes, Papaya, Mango, Strawberries]
}