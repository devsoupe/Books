package code_2_11

fun sum(x: Int, y: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(x, y)
}

val value = sum(5, 10, { x, y -> x + y })