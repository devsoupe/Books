package code_2_8

fun add(x: Int, y: Int = 3): Int = x + y

fun main(args: Array<String>) {
    println(add(9, 1)) // "10" 출력
    println(add(10)) // "13" 출력
}