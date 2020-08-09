package code_2_26

class User(var name: String, val age: Int = 18)

fun main(args: Array<String>) {
    val user = User("FP")

    println(user.name) // "FP" 출력
    println(user.age) // "18" 출력
}