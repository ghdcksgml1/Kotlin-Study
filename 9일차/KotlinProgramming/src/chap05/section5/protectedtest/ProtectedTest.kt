package chap05.section5.protectedtest

open class Base{ // 최상위 클래스에는 protected를 사용할 수 없음
    protected var i = 1
    protected fun protectedFunc() {
        i += 1 // 접근허용
    }

    fun access() {
        protectedFunc() // 접근 허용

    }
    protected class Nested // 내부 클래스에는 지시자 허용
}

class Derived : Base() {
    fun test(base: Base): Int {
        protectedFunc() // Base 클래스의 메서드 접근 가능
        return i // Base 클래스의 프로퍼티 접근 가능
    }

}

fun main() {
    val base = Base() // 생성 가능
//    base.i // 접근 불가
//    base.protectedFunc() // 접근 불가
    base.access() // 접근 가능
}