package code_2_15

import java.lang.Integer.parseInt

fun main(args: Array<String>) {
    var x = 0

    when (x) {
        1 -> print("x == 1")
        2, 3 -> print("x == 2 or 3")
        parseInt("4") -> print("x = 4")
        else -> print("else number")
    }
}