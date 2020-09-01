//Execution starts from Main
fun main() {

    var isStringBlank: Boolean = false

    println(isStringBlank)
    println(isStringBlank.not())

    isStringBlank = "".isBlank() //isBlank() is method of Char sequences
    println(isStringBlank)

    isStringBlank = "Kotlin".isBlank()
    println(isStringBlank)
}