//Execution starts from Main
fun main() {
    //How to create a Mutable Map in Kotlin

    //Mapping a variable in key value pair
    val statesMap = mutableMapOf(
            "DL" to "Delhi",
            "AP" to "Uttar Pradesh", //Adding wrong info
            "TS" to "Telangana",
            "MH" to "Maharashtra",
            "WB" to "West Bengal"
    )

    //Adding item to map
    statesMap.put("UP", "Uttar Pradesh")
    println(statesMap)

    //Note: put will replace value, if key matches in existing map
    statesMap.put("AP", "Andhra Pradesh")
    println(statesMap)

    //One way to avoid such override is
    statesMap.putIfAbsent("AP", "Andhra") //Will not update as it is already present
    println(statesMap)

    println(statesMap.get("MH")) //getter for map key "MH"

    //getOrPut adds item to map if not present. Otherwise returns existing data
    statesMap.getOrPut("TN", { "TamilNadu" })
    println(statesMap)

    //Remove a particular item
    statesMap.remove("WB")
    println(statesMap)

    //Clear all items from map
    statesMap.clear()
    println(statesMap)
}