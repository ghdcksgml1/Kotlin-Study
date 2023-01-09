package chap05.section2.init

import chap05.section2.secondary.Bird

class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    // 초기화 블록
    init {
        println("-------- 초기화 블록 시작 ---------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("-------- 초기화 블록 끝 ---------")
    }

    // 메서드
    fun fly() = {println("Fly wing: $wing")}
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
}