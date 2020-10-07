import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

//Execution starts from Main
fun main() {
    //Kotlin Performance - Measuring performance with measureNanoTime

    measureTime {
        val list = generateSequence(1) { it + 1_000 }
                .take(10)
                .toList()

        println(list.average()) //Prints 4501.0
    } //Prints Milli secs: 54
}

//Measuring performance of a block of code in milli seconds
//() represents, it takes in no parameter. Unit is return type which is void in JVMs
fun measureTime(block: () -> Unit) {
    val nanoTime = measureNanoTime(block)
    val millis = TimeUnit.NANOSECONDS.toMillis(nanoTime)
    println("Milli secs: $millis")
}