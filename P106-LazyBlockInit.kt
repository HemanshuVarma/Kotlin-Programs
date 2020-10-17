import java.lang.Thread.sleep
import kotlin.random.Random

//Execution starts from Main
fun main() {
    //Kotlin Lazy Initializer Block

    //Lazy initialization helps in loading application faster as these are computed only when they are called for the first time
    //Non-lazy variables are initialized when they run. This could slow down app loading drastically when long running task is computed
    val name: String by lazy {
        println("Processing")
        "Emy"
    }

    //lazy block: output would be stored in result
    val result: Lazy<Int> = lazy { performLongRunningTask() }

    println(name) //Evaluates the value at this point and Prints Processing followed by Emy
    println(name) //Prints already computed value Emy
    println(name) //Prints already computed value Emy

    println(result) //Prints Lazy value not initialized yet.
    //Helper method to check for initialization
    println("Is initialized: ${result.isInitialized()}") //Prints Is initialized: false
    println(result.value) //Prints system time in int (eg. 1428953707)
    println(result.value) //Prints system time in int and uses cached value (eg. 1428953707)
    println(result.value) //Prints system time in int and uses cached value (eg. 1428953707)
    println(result) //Prints value as it is initialized earlier (eg. 1428953707)
    println("Is initialized: ${result.isInitialized()}") //Prints Is initialized: true
}

fun performLongRunningTask(): Int {
    println("Computing")
    sleep(1000)
    return Random(System.currentTimeMillis()).nextInt()
}