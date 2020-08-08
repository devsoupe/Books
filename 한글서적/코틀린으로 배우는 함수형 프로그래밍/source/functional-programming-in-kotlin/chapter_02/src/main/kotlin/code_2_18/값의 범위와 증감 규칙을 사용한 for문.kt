package code_2_18

fun main(args: Array<String>) {

    for (i in 1..3) {
        print(i) // "123" 출력
    }

    for (i in 1 until 3) {
        print(i) // "12" 출력
    }

    for (i in 6 downTo 0 step 2) {
        print(i) // "6420" 출력
    }
}