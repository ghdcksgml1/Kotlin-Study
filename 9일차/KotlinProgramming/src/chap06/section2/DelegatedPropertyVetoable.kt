package chap06.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0) { // 초깃값은 0
        prop, old, new ->
        new > old // 조건에 맞지 않으면 거부권 행사
    }

    println(max)
    max = 10
    println(max)

    // 여기서는 기존값이 새 값보다 크므로 false. 따라서 5를 재할당하지 않음.
    max = 5
    println(max)

}