package code_2_36

import code_2_33.User

fun main(args: Array<String>) {
    val user: User = User("kotlin", 28)
    val (name, age) = user

    println("name : $name") // "name : kotlin" 출력
    println("age : $age") // "age : 28" 출력
}