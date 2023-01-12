package chap04.section2

fun main() {
    var sum = 0

    for (x in 1..10) sum += x
    println("sum: $sum")

    for (i in 1..5 step 2) print(i)
}