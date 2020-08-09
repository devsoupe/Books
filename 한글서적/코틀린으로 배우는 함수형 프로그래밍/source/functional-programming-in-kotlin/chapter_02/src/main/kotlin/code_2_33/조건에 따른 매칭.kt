package code_2_33

fun main(args: Array<String>) {
    println(checkCondition("kotlin")) // "kotlin" 출력
    println(checkCondition(5)) // "1..10" 출력
    println(checkCondition(User("Joe", 76))) // "== User(Joe, 76)" 출력
    println(checkCondition(User("Sandy", 65))) // "is User" 출력
    println(checkCondition("unknown")) // "SomeValue" 출력
}

data class User(val name: String, val age: Int)

fun checkCondition(value: Any) = when {
    value == "kotlin" -> "kotlin"
    value in 1..10 -> "1..10"
    value === User("Joe", 76) -> "=== User"
    value == User("Joe", 76) -> "== User(Joe, 76)"
    value is User -> "is User"
    else -> "SomeValue"
}