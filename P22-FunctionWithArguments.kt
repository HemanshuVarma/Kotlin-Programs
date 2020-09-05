//Execution starts from Main
fun main() {
    //Function arguments

    //Calling function and passing required parameters
    printStatus("Hemanshu", 16, true)
    printStatus("Joe", 32, false)
    printStatus("Harley", 72, false)


    //Calling a function whose fields are nullable
    sayHello("Kotlin")
    sayHello()
}

//Function with arguments, can be of any type and any number
//Notice, that all params are mandatory. Can be made otherwise using "?" symbol
fun printStatus(name: String, age: Int, isHappy: Boolean?) {
    print("Hey $name, ")
    when {
        age < 12 -> print("you are $age and too young ")
        age in 12..44 -> print("you are $age and fit ")
        else -> print("you are $age and old ")
    }
    print("and happy? $isHappy\n")
}

//Nullable param "name" has default string, which will be used when no param is passed.
fun sayHello(name: String? = "Varma") {
    println("$name")
}