package code_1_6

// 객체의 속성을 val로 선언하면 수정이 불가능함
data class ImmutablePerson(val name: String, val age: Int)

// Person 객체를 수정하지 않고, 새로운 객체를 생성하여 반환
fun addAge(person: ImmutablePerson, num: Int): ImmutablePerson {
    return ImmutablePerson(person.name, person.age + num)
}