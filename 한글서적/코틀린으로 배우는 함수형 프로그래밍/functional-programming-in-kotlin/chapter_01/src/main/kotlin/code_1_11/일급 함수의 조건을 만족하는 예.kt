package code_1_11

// 함수를 함수의 매개변수로 넘길 수 있다.
fun doSomething(func: (Int) -> String) {
    // do something
}

// 함수를 함수의 반환값으로 돌려 줄 수 있다.
fun doSomething(): (Int) -> String {
    return { value -> value.toString() }
}

// 함수를 List 자료구조에 담을 수 있다.
var funcList: List<(Int) -> String> = listOf({ value -> value.toString() })