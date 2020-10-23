package models

//Kotlin data class for Customer's info
data class Customer(val name: String) {
    fun hasLongName() = name.length > 10
}

//Kotlin data class for holding, subscription type - free or premium
data class CustomerType(var type: String)