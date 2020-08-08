package code_2_10

fun add(x: Int = 10, y: Int = 3): Int = x + y

fun main(args: Array<String>) {
    println(add(y = 7)) // "17" 출력
    println(add(y = 10, x = 20)) // "30" 출력
}