//Execution starts from Main
fun main() {
    //Kotlin map vs. flatMap

    val groceriesBag: List<ShoppingBag> = listOf(
            ShoppingBag(listOf("Grapes", "Papaya", "Watermelon")),
            ShoppingBag(listOf("Orange", "Apple")),
            ShoppingBag(listOf("Guava", "Banana"))
    )

    val retailBag: List<ShoppingBag> = listOf(
            ShoppingBag(listOf("USB", "Power Adapter")),
            ShoppingBag(listOf("Mobile", "Laptop", "SIM"))
    )

    val flatMapGroceriesBag = groceriesBag.flatMap { it.items } //Performs mapping and then flatting items to single list
    val flattenGroceriesBag = listOf(flatMapGroceriesBag)
    println(groceriesBag)
    println(flatMapGroceriesBag) //Prints [Grapes, Papaya, Watermelon, Orange, Apple, Guava, Banana]
    println(flattenGroceriesBag.flatten()) //Prints [Grapes, Papaya, Watermelon, Orange, Apple, Guava, Banana]
    //NOTE: flatMap is same as flatten

    val mapRetailBag = retailBag.map { it.items } //Maps each items but still maintains segregated list
    println(retailBag)
    println(mapRetailBag)
}

class ShoppingBag(val items: List<String>)