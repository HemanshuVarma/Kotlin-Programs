//Execution starts from Main
fun main() {
    //Kotlin For Loop

    val people = listOf("Ava", "Jane", "Kevin", "Peter", "Anne")

    //for iterates over each item in list and is similar to forEach.
    //Here "for" is OOP specific
    for (names in people) {
        println(names)
        /**
         * Prints:
         * Ava
         * Jane
         * Kevin
         * Peter
         * Anne
         */
    }

    for (i in 0 until 100) {
        println(i) //Prints from 0 to 99
    }

    for (i in 0 until 100 step 10) {
        println(i) //Prints from 0 until 100 but in multiples of 10
    }

    for (i in 100 downTo 0) {
        println(i) //Prints from 100 to 0
    }

    for (i in 100 downTo 0 step 10) {
        println(i) //Prints from 100 to 0 but in multiples of 10
    }
}