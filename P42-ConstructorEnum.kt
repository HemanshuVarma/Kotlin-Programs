//Execution starts from Main
fun main() {
    //Constructor Enum in Kotlin

    println("Account type is ${AccountType.PLATINUM}")
    println("Redeemable discount is ${AccountType.PLATINUM.discountPercent}")
    println("Number of subscribers needed are ${AccountType.PLATINUM.numberOfSubscription}")

    val value = AccountType.valueOf("Bronze".toUpperCase()) //Mapping with API data
    println(value)
    println(value.discountPercent)
    println(value.numberOfSubscription)

}

//Each enum constant is an object and are separated with commas
enum class AccountType(val discountPercent: Int, val numberOfSubscription: Int) {
    BRONZE(10, 1),
    SILVER(15, 5),
    GOLD(20, 10),
    PLATINUM(25, 15)
}