package chap04.section1

fun main() {
    cases("Hello") // String형
    cases(1) // Int형
    cases(System.currentTimeMillis()) // 현재 시간(밀리초 단위)을 Long형 값으로 반환
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}