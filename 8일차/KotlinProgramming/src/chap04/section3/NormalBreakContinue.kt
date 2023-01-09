package chap04.section3

fun main() {
    for(i in 1..5) {
        if(i == 3) break
        print(i)
    }
    println() // 개행문자
    println("outside")
}