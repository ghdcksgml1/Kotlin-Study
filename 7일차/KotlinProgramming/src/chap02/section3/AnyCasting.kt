package chap02.section3

fun main() {
    var a: Any = 1
    a = 20L
    a = "asdfasf"
    println("a: $a type: ${a.javaClass}")
}