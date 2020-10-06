//Execution starts from Main
fun main() {
    //Kotlin mapNotNull - Removing null items from a map

    
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
            "OD" to "Odisha",
            "CH" to "Chhattisgarh"
    )

    val result = statesMap.map(::getDataFromAPI)
    println(result) //Prints [DL=Delhi, AP=Uttar Pradesh, null, MH=Maharashtra, WB=West Bengal, UP=Uttar Pradesh, null, KA=Karnataka, OD=Odisha]

    //To avoid null, which may not be needed sometimes in API response. mapNotNull can be utilised
    val result1 = statesMap.mapNotNull(::getDataFromAPI)
    println(result1) //Prints [DL=Delhi, AP=Uttar Pradesh, MH=Maharashtra, WB=West Bengal, UP=Uttar Pradesh, KA=Karnataka, OD=Odisha, CH=Chhattisgarh]
}

//Simulating API response, which returns null for map keys starting with "N". Otherwise, the value
fun getDataFromAPI(entry: Map.Entry<String, String>): Map.Entry<String, String>? {
    return if (entry.key.startsWith("T")) {
        null
    } else
        entry
}