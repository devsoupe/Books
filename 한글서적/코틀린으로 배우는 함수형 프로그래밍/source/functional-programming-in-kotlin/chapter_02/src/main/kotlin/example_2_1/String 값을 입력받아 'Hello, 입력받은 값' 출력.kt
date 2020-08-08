package example_2_1

fun Any.hello(inputString: String): String {
    return "Hello, $inputString"
}

fun main(args: Array<String>) {
    println(10.hello("Kotlin"))
}