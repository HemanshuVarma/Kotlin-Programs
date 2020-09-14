//Execution starts from Main
fun main() {
    //Kotlin Singleton

    println(FavouriteFood.name) //Prints unknown

    FavouriteFood.name = "Apple" //Updating name of same instance
    println(FavouriteFood.name) //Prints Apple

    //Adding ingredients
    FavouriteFood.ingredients.add("Sugar")
    FavouriteFood.ingredients.add("Salt")

    //firstOrNull() prints the first item if available, otherwise "null"
    println(FavouriteFood.ingredients.firstOrNull()) //Prints "Sugar", which is the first item
    println(FavouriteFood.numberOfIngredients()) //Prints "2", as we have two items in ingredients
}

/**
 * Keyword "Object" make sures it has only ONE instance ever
 * Singletons in language like Java involves a lot of boilerplate code
 *
 * Read more at [https://kotlinlang.org/docs/tutorials/kotlin-for-py/objects-and-companion-objects.html]
 */
object FavouriteFood {

    //Singleton variables
    var name = "unknown"
    var ingredients = mutableListOf<String>()

    //Singleton methods
    fun numberOfIngredients() = ingredients.size
}