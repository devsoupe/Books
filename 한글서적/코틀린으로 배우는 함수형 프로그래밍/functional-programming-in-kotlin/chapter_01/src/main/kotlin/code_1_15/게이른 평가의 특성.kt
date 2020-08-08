package code_1_15

val lazyValue: String by lazy {
    println("시간이 오래 걸리는 작업")
    "hello"
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
}