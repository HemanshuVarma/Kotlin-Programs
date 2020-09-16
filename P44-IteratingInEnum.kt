//Execution starts from Main
fun main() {
    //Iterating over each element in Enum

    println("Traditional Approach")
    //Traditional approach
    //Here Enum.values() is of type Array
    for (accountType in AccountType.values()) {
        println(accountType)
    }

    println("\nConcise way") // \n is escape character for new line :)
    //Concise way with Kotlin helper functions
    AccountType.values().forEach { println(it) }
}

//Each enum constant is an object and are separated with commas
enum class AccountType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM
}