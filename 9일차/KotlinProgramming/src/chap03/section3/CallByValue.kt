package chap03.section3

fun main() {
    val result = callByValue(lambda())
    println(result)
}

fun callByValue(b: Boolean): Boolean {
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda function")
    true
}