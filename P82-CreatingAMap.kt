//Execution starts from Main
fun main() {
    //How To Create a Map in Kotlin

    //Mapping a variable in key value pair
    val statesMap = mapOf(
            "DL" to "Delhi",
            "AP" to "Andhra Pradesh",
            "TS" to "Telangana",
            "MH" to "Maharashtra",
            "WB" to "West Bengal"
    )

    //Prints value if present, otherwise null
    val result = statesMap["WB"] //Prints West Bengal
    //is equivalent to
    val result1 = statesMap.get("WB")
    println(result)
    println(result1)

    val result2 = statesMap.getOrDefault("TG", "UNKNOWN") //Prints default value if null
    println(result2) //Prints UNKNOWN

    val result3 = statesMap.getOrElse("TS", { "NOT FOUND" }) //Executes lambda if key is not matched
    println(result3) //Prints Telangana

    println(statesMap.entries) //Prints all entries i.e., [DL=Delhi, AP=Andhra Pradesh, TS=Telangana, MH=Maharashtra, WB=West Bengal]
    println(statesMap.keys) //Prints all keys i.e., [DL, AP, TS, MH, WB]
    println(statesMap.values) //Prints all values i.e., [Delhi, Andhra Pradesh, Telangana, Maharashtra, West Bengal]
}