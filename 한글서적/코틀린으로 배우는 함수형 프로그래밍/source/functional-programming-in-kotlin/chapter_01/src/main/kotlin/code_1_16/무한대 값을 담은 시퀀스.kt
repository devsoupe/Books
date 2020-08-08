package code_1_16

val infiniteValue = generateSequence(0) { it + 5 }

fun main(args: Array<String>) {
    infiniteValue.take(5).forEach { print("$it ") } // "0 5 10 15 20" 출력
}