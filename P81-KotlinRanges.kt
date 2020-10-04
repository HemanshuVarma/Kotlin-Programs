//Execution starts from Main
fun main() {
    //Kotlin Ranges

    val i = 8

    //Double dots, represents range(from and to) values to be considered
    //Ranges are applicable only for Byte, Short, Int and Long
    if (i in 0..18) {
        println("Teen")
    } else {
        println("Adult")
    }

    for (j in 0..50 step 10) {
        println(j) //Prints 0 10 20 30 40 50
    }
    val names = listOf("Adam", "Ellie", "Paul")

    for (name in names) {
        println(name) //Prints Adam Ellie Paul
    }
}