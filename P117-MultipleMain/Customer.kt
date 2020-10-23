//Using main function to quickly execute logic. IDE still compiles this and main function of Main.kt has priority over all.
fun main() {
    println("Customer class")
}

//Kotlin data class for Customer's info
data class Customer(val name: String) {
    fun hasLongName() = name.length > 10
}

//Kotlin data class for holding, subscription type - free or premium
data class CustomerType(var type: String)