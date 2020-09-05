//Execution starts from Main
fun main() {
    //Function arguments

    //Calling functions with params, but has poor readability as params naming is not present.
    //This may be confusing to check which params is passed in what position
    printUserInfo("Hemanshu", "Varma", 7, true, false)

    //Named params has good readability and same internal functionality
    printUserInfo(firstName = "Joe", likesPopCorn = false, lastName = "Casey", age = 30)
    //Order can also be changed for name params
    printUserInfo(age = 22, likesMovies = true, firstName = "Jack", lastName = "Jonny")
}

//Function with arguments, can be of any type and any number
//Notice, that all params are mandatory. Can be made otherwise using "?" symbol
//If "likesMovies, likesPopCorn" is not supplied, then default value would be used
fun printUserInfo(firstName: String, lastName: String, age: Int,
                  likesMovies: Boolean = false, likesPopCorn: Boolean = true) {
    println("Hey, $firstName $lastName. You are $age years old also," +
            " you like movies? $likesMovies and like popcorn? $likesPopCorn")

    //Code can be cleaned up to an extent with default arguments in function
}