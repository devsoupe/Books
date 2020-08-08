package code_2_16

fun main(args: Array<String>) {
    var x = 0

    val numType = when {
        x == 0 -> "zero"
        x > 0 -> "positive"
        else -> "negative"
    }
}