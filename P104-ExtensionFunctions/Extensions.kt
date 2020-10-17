/**
 * An extension function helps to add new, user defined functionality to existing APIs without having to inherit from the class
 * For example, you can write new functions for a class from a third-party library that you can't modify.
 *
 * Read more[https://kotlinlang.org/docs/reference/extensions.html]
 */

//Creating extension function for Person class to return full name
fun Person.fullName() = "${this.firstName} ${this.lastName}"

//Extension function on Int, which returns true if person is child(age is less than 18) otherwise false
fun Int.isChild(): Boolean {
    return this <= 18
}