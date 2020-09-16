//Execution starts from Main
fun main() {
    //Abstract functions inside of Enum in Kotlin

    val value = AccountType.valueOf("Bronze".toUpperCase()) //Mapping with API data
    println(value)
    println(value.calculateDiscountPercent())

}

//Each enum constant is an object and are separated with commas
enum class AccountType {
    BRONZE {
        override fun calculateDiscountPercent(): Int {
            var discount = 10
            // Perform complex calculations
            return discount
        }
    },
    SILVER {
        //For single line calculations
        override fun calculateDiscountPercent() = 15
    },
    GOLD {
        override fun calculateDiscountPercent() = 20
    },
    PLATINUM {
        override fun calculateDiscountPercent() = 25
    };

    /**
     * Abstract fun to perform some task based upon data.
     * For instance like, calculate discount based upon user's type of account
     *
     * Note: Abstract function has to be implemented by each Enum objects
     */
    abstract fun calculateDiscountPercent(): Int
}