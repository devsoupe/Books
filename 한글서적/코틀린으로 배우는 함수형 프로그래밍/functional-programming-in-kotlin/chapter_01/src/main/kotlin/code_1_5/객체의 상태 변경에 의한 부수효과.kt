package code_1_5

data class MutablePerson(var name: String, var age: Int)

// 인자로 들어오느 객체의 상태를 변경
fun addAge(person: MutablePerson, num: Int) {
    person.age += num
}