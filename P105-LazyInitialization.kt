//Execution starts from Main
fun main() {
    //Kotlin Lazy Evaluation

    //Lazy initialization helps in loading application faster as these are computed only when they are called for the first time
    //Non-lazy variables are initialized when they run. This could slow down app loading drastically when long running task is computed
    val name: String by lazy {
        println("Processing")
        "Emy"
    }

    println(name) //Evaluates the value at this point and Prints Processing followed by Emy
    println(name) //Prints already computed value Emy
    println(name) //Prints already computed value Emy
}
