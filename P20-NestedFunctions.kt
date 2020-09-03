//Execution starts from Main
fun main() {
    //Nested Functions

    sayHello()
}

//Nested functions. A function inside function
//Cons: Poor readability
fun sayHello() {
    println("Hello")

    fun greet() {
        println("Greetings of the day")

        fun sayBye() {
            println("Thanks")
        }
        sayBye()
    }
    greet()

    //Outputs:
    //Hello
    //Greetings of the day
    //Thanks
}