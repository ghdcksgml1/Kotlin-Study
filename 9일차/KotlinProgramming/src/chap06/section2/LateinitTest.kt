package chap06.section2

class Person {
    lateinit var name: String // 지연 초기화를 위한 선언

    fun test() {
        if(!::name.isInitialized) { // 프로퍼티의 초기화 여부 판단
            println("not initialized")
        }else {
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "Kildong" // 이 시점에서 초기화됨(지연 초기화)
    kildong.test()
    println("name = ${kildong.name}")
}
