package chap03.section3

fun main() {
    val out: () -> Unit = {println("Hello World!")}

    out()
    val new = out
    new()
}