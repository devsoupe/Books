package code_2_25

class User(var name: String, val age: Int)

fun main(args: Array<String>) {
    val user = User("FP", 32)
    println(user.name) // "FP" 출력

    user.name = "kotlin"
    println(user.name) // "kotlin" 출력
}