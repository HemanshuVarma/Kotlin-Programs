import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

//Execution starts from Main
fun main() {
    //Kotlin Sequences - Improving performance with Kotlin Sequences

    listOf('A', 'B', 'C').filter {
        println("Filter: $it")
        true
    }.forEach {
        println("Map: $it")
    }
    //Prints
    //Filter: A
    //Filter: B
    //Filter: C
    //Map: A
    //Map: B
    //Map: C

    sequenceOf('A', 'B', 'C').filter {
        println("Filter: $it")
        true
    }.forEach {
        println("Map: $it")
    }
    //Prints
    //Filter: A
    //Map: A
    //Filter: B
    //Map: B
    //Filter: C
    //Map: C

    val list = getListOfCustomers() //Simulating large list of customers from server

    measureTime {

        //Measuring time with list of data
        println(list.filter { it % 3 == 0 }.average()) //Prints 2.50000005E7
    } //Prints Milli secs: 1631 [varies on system performance each time]

    measureTime {

        //Measuring time with sequence of data. Sequences are much efficient
        println(list.asSequence().filter { it % 3 == 0 }.average()) //Prints 2.50000005E7
    } //Prints Milli secs: 458 [varies on system performance each time but would be lesser than list data result]

    //Read more at [https://kotlinlang.org/docs/reference/sequences.html]
}

//Measuring performance of a block of code in milli seconds
//() represents, it takes in no parameter. Unit is return type which is void in JVMs
fun measureTime(block: () -> Unit) {
    val nanoTime = measureNanoTime(block)
    val millis = TimeUnit.NANOSECONDS.toMillis(nanoTime)
    println("Milli secs: $millis")
}

fun getListOfCustomers(): List<Int> {
    return generateSequence(1) { it + 1 }
            .take(50_000_000) //50 million
            .toList()
}