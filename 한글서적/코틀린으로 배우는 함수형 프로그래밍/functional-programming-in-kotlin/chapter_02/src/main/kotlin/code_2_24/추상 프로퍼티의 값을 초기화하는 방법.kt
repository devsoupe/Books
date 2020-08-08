package code_2_24

fun main(args: Array<String>) {
    val kotlin: Kotlin = Kotlin()
    println(kotlin.bar) // "3" 출력
}

interface Foo {

    val bar: Int
        get() = 3

    fun printFoo() {
        println("Foo")
    }
}

class Kotlin : Foo {
    
}
