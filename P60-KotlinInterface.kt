//Execution starts from Main
fun main() {
    //Kotlin Interfaces - Creating an Interface in Kotlin

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