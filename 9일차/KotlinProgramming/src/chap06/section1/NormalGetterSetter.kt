package chap06.section1

class User1(_id: Int, _name: String, _age: Int) {
    // 프로퍼티
    val id: Int = _id
    get() = field

    var name: String = _name
    get() = field
    set(value) {
        field = value
    }

    var age: Int = _age
    get() = field
    set(value) {
        println("age 값 변경")
        field = value
    }

}

fun main() {
    val user1 = User1(1, "kildong", 30)
//    user1.id = 2 // val 프로퍼티는 값 변경 불가
    user1.age = 35
    println("user1.age = ${user1.age}")
}