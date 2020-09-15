//Execution starts from Main
fun main() {
    //Enum in Kotlin

    println(AccountType.PLATINUM) //Prints account type which is GOLD

    //Instance of user
    val user = User("Adam", "Parker")
    println(user) //Prints Adam Parker is BRONZE user
    user.accountType = AccountType.SILVER //Updating account type of user to SILVER
    println(user) //Prints Adam Parker is SILVER user
    println(user.accountType == AccountType.SILVER) //Prints true as account type is same
    println(user.accountType == AccountType.GOLD) //Prints false as account type is not same
}

/**
 * Class for User info
 * @param firstName is user's first name and is mandatory
 * @param lastName is user's last name and is mandatory
 * @param accountType is user's type of account and is optional. Default is set to BRONZE
 */
class User(var firstName: String, var lastName: String, var accountType: AccountType = AccountType.BRONZE) {

    private fun fullName() = "$firstName $lastName"

    override fun toString(): String {
        return fullName() + " is $accountType user"
    }
}

//Each enum constant is an object and are separated with commas
enum class AccountType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM
}