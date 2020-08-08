package code_1_9

fun main(args: Array<String>) {
    val result = transparent("Joe")
    print(result)
}

fun transparent(name: String): String {
    return "Hello $name"
}

fun print(helloStr: String) {
    println(helloStr)
}