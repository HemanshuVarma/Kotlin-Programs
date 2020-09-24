//Execution starts from Main
fun main() {
    //Kotlin Interfaces - Implementing an Interface in Kotlin

    //Instances
    val digitalProduct = DigitalProduct()
    val genericToy = GenericToy()

    println(digitalProduct.discountPercent()) //Prints 10.0
    digitalProduct.creditCardDiscount() //Prints "Discount on credit card is 20%"

    println(genericToy.discountPercent()) //Prints 5.0
    genericToy.creditCardDiscount() //Prints "Discount availed is 7%"
}

//Class implementing "Discountable" interface has t override all the methods.
class DigitalProduct : Discountable {
    override fun discountPercent(): Double {
        //Perform some calculation
        return 10.0
    }

    override fun creditCardDiscount() {
        println("Discount on credit card is 20%")
    }
}

class GenericToy : Discountable {
    //Directly returning 5% discount on toys
    override fun discountPercent() = 5.0

    override fun creditCardDiscount() {
        //Some logic here
        println("Discount availed is 7%")
    }

}

/**
 * Interface for Discountable
 *
 * Interfaces in Kotlin can contain declarations of abstract methods, as well as method implementations.
 * What makes them different from abstract classes is that interfaces cannot store state.
 * They can have properties but these need to be abstract or to provide accessor(getter) implementation.
 */
interface Discountable {
    fun discountPercent(): Double
    fun creditCardDiscount()
}