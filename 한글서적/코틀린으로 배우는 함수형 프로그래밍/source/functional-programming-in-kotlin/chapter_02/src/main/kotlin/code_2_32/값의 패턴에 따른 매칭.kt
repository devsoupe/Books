package code_2_32

fun main(args: Array<String>) {
    println(checkValue("kotlin")) // "kotlin" 출력
    println(checkValue(5)) // "1..10" 출력
    println(checkValue(15)) // "11 or 15" 출력
    println(checkValue(User("Joe", 76))) // "User" 출력
    println(checkValue("unknown")) // "SomeValue" 출력
}

data class User(val name: String, val age: Int)

fun checkValue(value: Any) = when (value) {
    "kotlin" -> "kotlin"
    in 1..10 -> "1..10"
    11, 15 -> "11 or 15"
    is User -> "User"
    else -> "SomeValue"
}