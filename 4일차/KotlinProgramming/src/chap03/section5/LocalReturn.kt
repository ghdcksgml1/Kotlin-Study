package chap03.section5

fun main() {
    shortFun3(3) {
        println("First call: $it")
        return@shortFun3
    }

    println("Hi")
}

inline fun shortFun3(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}