//Execution starts from Main
fun main() {
    //Kotlin Protected Modifier for Methods

    //Instance of Chef class
    val chef = Chef("Ray", 30, "stew")

    chef.setMyFavouriteFood("grapes")
}

/**
 * Class Person taking name and age
 * Keyword "open" is used inorder to allow inheritance.
 * Keyword "protected" allows the variable to be visible in inherited class and itself.
 */
open class Person(val name: String, val age: Int) {

}

open class Chef(name: String, age: Int, var favFood: String) : Person(name, age) {

    protected fun printFavFood() = println(favFood)

    fun setMyFavouriteFood(food: String) {
        favFood = food
        //Accessible within class
        printFavFood()
    }
}

class SousChef(name: String, age: Int, var food: String) : Chef(name, age, food) {

    init {
        //Accessible in child class(Chef) too
        printFavFood()
    }
}