//Execution starts from Main
fun main() {
    //Providing Multiple Arguments of the Same Type using varargs

    printBookInfo("Nice title", "Author1", "Author2", "Author 3")
}

//A book can have multiple authors and when count is not known, it is difficult to maintain all the authors
//Instead of having multiple variables for authors, varargs can be utilised.
//varargs allows ZERO or MORE number of params. varargs is array based, so iteration is required.
fun printBookInfo(bookName: String, vararg author: String) {
    println("Book Name: $bookName")
    author.forEach { println("Authors: $it") }
}