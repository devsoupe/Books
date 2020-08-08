package code_2_23

fun main(args: Array<String>) {
    val kotlin: Kotlin = Kotlin()
    println(kotlin.bar) // "3" 출력
}

interface Foo {
    val bar: Int

    fun printFoo() {
        println("Foo")
    }
}

class Kotlin : Foo {
    override val bar: Int = 3
}
