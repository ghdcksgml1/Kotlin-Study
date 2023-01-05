package chap04.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when {
        score >= 90.0 -> grade = 'A' // 인자 있는 when문과 다르게 조건식을 구성할 수 있음
        score in 80.0 .. 89.9 -> grade = 'B'
        score in 70.0 .. 79.9 -> grade = 'C'
        else -> grade = 'F'
    }
    println("Score: $score, Grade: $grade")
}