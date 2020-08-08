package code_1_2

fun main(args: Array<String>) {
    println(impureFunction(1, 2)) // "13" 출력
    z = 20
    println(impureFunction(1, 2)) // "23" 출력
}

var z = 10

// 순수하지 않은 함수
fun impureFunction(x: Int, y: Int): Int = x + y + z
