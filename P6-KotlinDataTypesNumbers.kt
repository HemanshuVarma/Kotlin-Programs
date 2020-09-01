//Execution starts from Main
fun main() {

    val myByte: Byte = 8 // 8-bit signed integer
    val myShort: Short = 16 // 16-bit short integer
    val myInt: Int = 32 // 32-bit signed integer
    val myLong: Long = 64 // 64-bit signed integer


    //Decimals
    val myFloat: Float = 32.00f // 32-bit floating point number
    val myDouble: Double = 64.00 // 64-bit floating point number

    //Determine the type of variable
    println(myFloat::class) // prints float
    println(myFloat.toInt()::class) // prints int

    val someBigNumber: Long = 1_000_000 // easy readability

    val myResult = myInt.times(myShort)
    println(myResult)
}