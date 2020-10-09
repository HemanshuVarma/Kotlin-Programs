//Execution starts from Main
fun main() {
    //Kotlin - List vs. Set vs. Map vs. Sequence

    //list can be of any type and allows duplicates. Not good at performance though
    val list: List<String> = listOf("Andrew", "Jane", "Alan", "Ellie")

    //Set won't allow duplicates
    val set: Set<String> = setOf("Andrew", "Ellie", "Alan", "Jane", "John", "John", "Ellie")

    //Mapping from one type to another in the form of key value pair
    val map: Map<Int, String> = mapOf(1 to "One", 2 to "Two", 3 to "Three", 4 to "Four")

    //Has best performance but allows duplicates.
    val sequence: Sequence<String> = sequenceOf("Andrew", "Jane", "Alan", "Ellie", "Jane")

    //However, as list can be converted to sequence and vice-versa
    list.asSequence()
    sequence.toList()
}