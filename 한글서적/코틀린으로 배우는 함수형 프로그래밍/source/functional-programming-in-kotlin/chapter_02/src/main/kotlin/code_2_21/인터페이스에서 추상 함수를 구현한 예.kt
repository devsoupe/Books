package code_2_21

fun main(args: Array<String>) {
    val kotlin = Kotlin()

    kotlin.printFoo() // "Foo" 출력
    kotlin.printBar() // "Kotlin - Bar" 출력
}

interface Foo {

    fun printFoo() {
        println("Foo")
    }
}

interface Bar {

    fun printBar() {
        println("Bar")
    }
}

class Kotlin : Foo, Bar {

    override fun printBar() {
        println("Kotlin - Bar")
    }
}