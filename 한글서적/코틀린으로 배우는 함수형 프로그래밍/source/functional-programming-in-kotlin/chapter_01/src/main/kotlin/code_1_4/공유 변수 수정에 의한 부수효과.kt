package code_1_4

fun main(args: Array<String>) {
    println(impureFunction(1, 2)) // "13" 출력
    println(withSideEffect(10, 20)) // "30" 출력
    println(impureFunction(1, 2)) // "12" 출력
}

var z = 10

// 순수하지 않은 함수
fun impureFunction(x: Int, y: Int): Int = x + y + z

// 부수효과가 있는 함수
fun withSideEffect(x: Int, y: Int): Int {
    z = y
    return x + y
}