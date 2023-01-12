package chap06.section2

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("NONAME") { // 프로퍼티 위임
        prop, old, new -> // 람다식 매개변수로 프로퍼티, 기존 값, 새로운 값 지정
        println("property -> ${prop}")
        println("$old -> $new") // 이 부분은 이벤트가 발생할 때만 실행
    }

}

fun main() {
    val user = User()
    user.name = "Kildong" // 값이 변경되는 시점에서 첫 이벤트 발생
    user.name = "Dooly" // 값이 변경되는 시점에서 두번째 이벤트 발생
}