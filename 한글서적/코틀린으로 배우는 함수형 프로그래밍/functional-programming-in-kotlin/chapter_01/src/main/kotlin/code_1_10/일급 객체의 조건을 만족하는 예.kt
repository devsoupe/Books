package code_1_10

// Any를 함수의 매개변수로 넘길 수 있다.
fun doSomethingWithAny(any: Any) {
    // do something
}

// Any를 함수의 반환값으로 돌려 줄 수 있다.
fun doSomethingWithAny(): Any {
    return Any()
}

// Any를 List 자료구조에 담을 수 있다.
var anyList: List<Any> = listOf(Any())