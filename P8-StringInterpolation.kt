//Execution starts from Main
fun main() {

    //Multi-line string
    val myMessage = """
        Hello World!
        Welcome to Kotlin
        Hope you have a pleasant experience
    """.trimIndent()  //trimIndent removes the indents in/around multi line string
    // .replaceIndent("{YOUR_STRING}")  replaces all the indents with user input string
    //.trimMargin("{YOUR_PATTERN}") replaces indents with the matching string

    println(myMessage)
    println("\n$myMessage, Hemanshu") //Replacing concatenation to template
    println("\nTotal chars in message ${myMessage.length}") //Performing operation in template variable enclosing using {}
}