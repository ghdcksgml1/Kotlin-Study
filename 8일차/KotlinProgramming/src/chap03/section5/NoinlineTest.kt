package chap03.section5

fun main() {
    shortFunc2(3) { println("First call: $it") }
}

inline fun shortFunc2(a: Int, noinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}