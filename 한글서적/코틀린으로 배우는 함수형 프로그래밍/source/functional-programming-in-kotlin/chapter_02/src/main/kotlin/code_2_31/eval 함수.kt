package code_2_31

import code_2_30.Const
import code_2_30.Expr
import code_2_30.NotANumber
import code_2_30.Sum

fun eval(expr: Expr): Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    is NotANumber -> Double.NaN
}