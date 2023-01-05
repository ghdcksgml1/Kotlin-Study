package chap02.section3

fun main() {
    check("hello") // 문자열 인자
    check(5) // Int형 인자

    val x: Int = 7;
    println(x.shl(3))
}

fun check(x: Any) { // Any이기 때문에 유연하게 인자를 받을 수 있다.
    if (x is String) {
        println("x is String: $x")
    }
    if (x is Int) {
        println("x is Int: $x")
    }

}