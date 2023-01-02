package chap03.section3

fun main() {
    val res1 = funcParam(3, 2, ::sum2)
    println(res1)

    hello(::text)

    val likeLambda = ::sum2 // 일반 변수에 값처럼 할당할 수도 있다.
    println(likeLambda(6,6))
}

fun sum2(a: Int, b: Int) = a+b

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a,b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))

}