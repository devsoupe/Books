package code_2_35

fun sum(numbers: List<Int>): Int = when {
    numbers.isEmpty() -> 0
    else -> numbers.first() + sum(numbers.drop(1))
}