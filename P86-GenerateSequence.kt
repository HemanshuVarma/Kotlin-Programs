//Execution starts from Main
fun main() {
    //Generate Sequences and Lists in Kotlin with generateSequence

    val list = generateSequence(1) { it + 10_000 } //generate sequence starting with 1 and add 10,000 each time
            .take(5) //size
            .toList()

    println(list) //Prints [1, 10001, 20001, 30001, 40001]

    //Printing average
    println("Average is: ${list.average()}") //Prints Average is: 20001.0
}