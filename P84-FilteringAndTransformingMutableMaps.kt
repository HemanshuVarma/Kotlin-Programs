//Execution starts from Main
fun main() {
    //Filtering and Transforming Maps in Kotlin

    //Mapping a variable in key value pair
    val statesMap = mutableMapOf(
            "DL" to "Delhi",
            "AP" to "Andhra Pradesh",
            "TS" to "Telangana",
            "MH" to "Maharashtra",
            "WB" to "West Bengal",
            "UP" to "Uttar Pradesh",
            "TN" to "Tamil Nadu",
            "KA" to "Karnataka",
            "OD" to "Odisha"
    )

    //checking for non-empty map
    println(statesMap.any()) //Returns `true` if map has at least one entry.

    //checking for empty map. Both of below does the same
    println(statesMap.none())
    println(statesMap.isEmpty())

    //Filtering in map, includes key and value
    val result = statesMap.filter { it.value.contains("A", true) }
    println(result) //Prints {AP=Andhra Pradesh, TS=Telangana, MH=Maharashtra, WB=West Bengal, UP=Uttar Pradesh, TN=Tamil Nadu, KA=Karnataka, OD=Odisha}

    //Filtering with keys
    val result1 = statesMap.filterKeys { it.startsWith("T", true) }
    //Filter and store only keys
    val result2 = statesMap.filterKeys { it.startsWith("T", true) }.keys
    //Filter and store only values
    val result3 = statesMap.filterKeys { it.startsWith("T", true) }.values
    println(result1) //Prints {TS=Telangana, TN=Tamil Nadu}
    println(result2) //Prints [TS, TN]
    println(result3) //Prints [Telangana, Tamil Nadu]

    //Filtering with values
    val result4 = statesMap.filterValues { it.startsWith("T", true) }
    println(result4) //Prints {TS=Telangana, TN=Tamil Nadu}

    //Filtering with keys and mapping values as the key itself
    val result5 = statesMap.filterKeys { it.startsWith("T", true) }.mapValues { it.key }
    println(result5) //Prints {TS=TS, TN=TN}
}