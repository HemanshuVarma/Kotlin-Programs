//Execution starts from Main
fun main() {
    //Kotlin Protected Modifier for Variables

    //Instance of person class
    val person = Person("John", 22)
    val chef = Chef("Ray", 30, "stew")

    person.printFavFood()

    chef.printFavFood()
    chef.setMyFavouriteFood("spinach")
    chef.printFavFood()
}

/**
 * Class Person taking name and age
 * Keyword "open" is used inorder to allow inheritance.
 * Keyword "protected" allows the variable to be visible in inherited class and itself.
 */
open class Person(val name: String, val age: Int) {

    protected var favouriteFood = "unknown"

    fun printFavFood() = println(favouriteFood)
}

class Chef(name: String, age: Int, favFood: String) : Person(name, age) {

    init {
        favouriteFood = favFood
    }

    fun setMyFavouriteFood(food: String) {
        favouriteFood = food
    }
}