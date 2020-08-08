package code_2_20

interface Foo {
    fun printFoo()
}

interface Bar {
    fun printBar()
}

class Kotlin : Foo, Bar {

    override fun printFoo() {
        // ...
    }

    override fun printBar() {
        // ...
    }
}