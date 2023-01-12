package chap03.section3

fun main() {
    println("funcFunc: ${funFunc()}")
}

fun sum1(a: Int, b: Int) = a+b
fun funFunc(): Int{
    return sum1(2,2)
}