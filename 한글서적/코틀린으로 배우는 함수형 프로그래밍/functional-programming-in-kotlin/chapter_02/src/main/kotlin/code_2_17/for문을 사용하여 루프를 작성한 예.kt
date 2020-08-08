package code_2_17

fun main(args: Array<String>) {
    val collection = listOf(1, 2, 3)

    for (item in collection) {
        print(item) // "123" 출력
    }

    println()

    for ((index, item) in collection.withIndex()) {
        println("the element at $index is $item")
    }

    // the element at 0 is 1
    // the element at 1 is 2
    // the element at 2 is 3
}