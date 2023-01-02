package chap02.section2

fun main() {
    var a = 1 // 1이기 때문에 코틀린에서 Int로 자료형을 결정
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}" // 1 + 2의 값인 3이 문자열에 추가된다.

    println("str1: \"$str1\", str2: \"$str2\"")

    var b = 2
    val str3 = "a = $b"
    val str4 = "a = $b"
    println(str3 === str4)
}