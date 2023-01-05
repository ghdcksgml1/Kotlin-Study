package chap03.section1

import java.lang.Integer.max

fun main() { // 최초의 스택 프레임
    val num1 = 10
    val num2 = 3
    val result: Int

    result = max(10, 3) // 두 번째 스택 프레임
}

fun max(a: Int, b: Int) = if (a>b) a else b