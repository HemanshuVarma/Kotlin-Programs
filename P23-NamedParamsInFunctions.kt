//Execution starts from Main
fun main() {
    //Function arguments

    //Calling functions with params, but has poor readability as params naming is not present.
    //This may be confusing to check which params is passed in what position
    printUserInfo("Hemanshu", "Varma", 7)

    //Named params has good readability and same internal functionality
    printUserInfo(firstName = "Joe", lastName = "Casey", age = 30)
    //Order can also be changed for name params
    printUserInfo(age = 22, firstName = "Jack", lastName = "Jonny")
}

//Function with arguments, can be of any type and any number
//Notice, that all params are mandatory. Can be made otherwise using "?" symbol
fun printUserInfo(firstName: String, lastName: String, age: Int) {
    println("Hey, $firstName $lastName. You are $age years old")
}