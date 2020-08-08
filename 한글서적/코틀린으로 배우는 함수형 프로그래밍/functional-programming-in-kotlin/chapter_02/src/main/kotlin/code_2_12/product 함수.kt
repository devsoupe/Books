package code_2_12

fun Int.product(value: Int): Int {
    return this * value
}

fun main(args: Array<String>) {
    println(10.product(2)) // "20" 출력
}