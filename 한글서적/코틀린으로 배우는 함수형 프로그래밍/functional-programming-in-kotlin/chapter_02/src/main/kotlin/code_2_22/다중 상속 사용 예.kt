package code_2_22

fun main(args: Array<String>) {
    val kotlin: Kotlin = Kotlin()

    kotlin.printBar() // "Bar" 출력
    kotlin.printFoo() // "Foo" 출력
    kotlin.printKotlin() // "Foo Kotiln\nBar Kotlin 출력
}

interface Foo {

    fun printFoo() {
        println("Foo")
    }

    fun printKotlin() {
        println("Foo Kotlin")
    }
}

interface Bar {

    fun printBar() {
        println("Bar")
    }

    fun printKotlin() {
        println("Bar Kotlin")
    }
}

class Kotlin : Foo, Bar {

    override fun printKotlin() {
        super<Foo>.printKotlin()
        super<Bar>.printKotlin()
    }
}