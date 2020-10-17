//Execution starts from Main
fun main() {
    //Creating a Kotlin Extension Function

    //Creating instance of person class
    val person = Person(firstName = "John", lastName = "Smith", age = 43)

    //Calling extension function
    println(person.fullName()) //Prints John Smith

    println("Is child: ${person.age.isChild()}") //Prints Is child: false
}
