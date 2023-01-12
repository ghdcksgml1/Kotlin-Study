package chap03.section3

fun main() {
    noParam({ "Hello World!" })
    noParam { "Hello World!" }
}

fun noParam(out: () -> String) = println(out())