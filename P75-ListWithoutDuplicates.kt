//Execution starts from Main
fun main() {
    //Kotlin Set - A Immutable and Mutable List with No Duplicates

    //Sets do not allow duplicates and is a part of Kotlin Collection Library
    //However, setOf() is immutable meaning, it cannot be altered at later stages
    val immutableNameCollection: Set<String> = setOf("James", "Paul", "Ellie", "Anne", "Anne")
    println(immutableNameCollection) //Prints [James, Paul, Ellie, Anne]

    val mutableNameCollection: MutableSet<String> = mutableSetOf("Alan", "Emy", "John", "Anne")
    println(mutableNameCollection)

    mutableNameCollection.add("Emy") //Duplicates won't be added to list
    mutableNameCollection.add("James")
    println(mutableNameCollection) //Prints [Alan, Emy, John, Anne, James]

    //NOTE: Sets don't allow duplicate in Data/Model classes as well
}