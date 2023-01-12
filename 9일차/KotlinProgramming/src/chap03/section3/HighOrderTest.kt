package chap03.section3

fun main() {
    var result: Int
//    val multi = {x: Int, y:Int -> x * y}
    val multi: (Int, Int) -> Int = {x, y -> x*y}
    result = multi(10,20)
    println(result)
}