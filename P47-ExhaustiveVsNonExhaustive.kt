//Execution starts from Main
fun main() {
    //Kotlin when Statement - Exhaustive vs Non-exhaustive

    val accountType = AccountType.PLATINUM
    //Non-Exhaustive when statement.
    //Such statements do not have default block called "else" and still be compiled
    when (accountType) {
        AccountType.SILVER -> println("$accountType User")
    }

    //Exhaustive type, which is expecting to return some result along with default branch called "else"
    // or at least implements all cases of when expression
    val message = when (accountType) {
        AccountType.BRONZE -> "$accountType User"
        AccountType.SILVER -> "$accountType User"
        AccountType.GOLD -> "$accountType User"
        AccountType.PLATINUM -> "$accountType User"
    }
    println(message)

}

enum class AccountType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM
}