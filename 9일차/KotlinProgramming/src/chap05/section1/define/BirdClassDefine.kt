package chap05.section1.define

class Bird {
    var name: String = "mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    fun fly() = println("Fly wing; $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")

}

fun main() {
    val coco = Bird()
    coco.color = "blue"

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}