package code_2_9

fun add(x: Int = 10, y: Int = 3): Int = x + y

fun main(args: Array<String>) {
    println(add()) // "13" 출력
    println(add(7)) // "10" 출력
}