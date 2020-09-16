//Execution starts from Main
fun main() {
    //Adding static like methods to Enum using companion objects in Kotlin

    val accountType = AccountType.getAccountTypeByName("bronze") //Any casing is allowed as it'd be converted to uppercase in the end by helper method
    println(accountType)

    println(AccountType.getAccountTypeByName("SiLvEr"))
    println(AccountType.getAccountTypeByName("Gold"))
    println(AccountType.getAccountTypeByName("PLATINUM"))
}

//Each enum constant is an object and are separated with commas
enum class AccountType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM;

    //Static object
    companion object {
        fun getAccountTypeByName(name: String) = AccountType.valueOf(name.toUpperCase())
    }
}