package code_1_3

var z = 10

// 부수효과가 있는 함수
fun impureFunctionWithSideEffect(x: Int, y: Int): Int {
    code_1_2.z = y
    return x + y
}