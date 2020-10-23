package services

//Input - Adam Parker, output - AP
fun String.initials(): String {
    val name = this.split(' ')
    val firstName = name[0].substring(0, 1)
    val lastName = name[1].substring(0, 1)
    return "$firstName$lastName"
}