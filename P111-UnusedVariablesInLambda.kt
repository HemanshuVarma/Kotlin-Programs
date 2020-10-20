//Execution starts from Main
fun main() {
    //Kotlin Lambdas - Using Underscores to Signify Unused Parameters

    //Syntax of lambda
    //val lambdaName: (input params) -> return type { input params -> body }

    //invoking lambda
    loremIpsum(5) { _, word -> //index which was unused can be replaced with under score(_) as per kotlin convention
        print(word)
        print(" ")
    }
}


fun loremIpsum(times: Int, block: (Int, String) -> Unit) {
    repeat(times) { index ->
        block(index, loremIpsumList.random()) //Passes index and random word on each iteration
    }
}

//A list of lorem ipsum words
val loremIpsumList = listOf(
        "Lorem",
        "ipsum",
        "dolor",
        "sit",
        "amet",
        "consectetur",
        "adipiscing",
        "elit",
        "Aenean",
        "maximus",
        "feugiat",
        "fermentum",
        "Nullam",
        "varius",
        "massa",
        "et",
        "laoreet",
        "posuere"
)