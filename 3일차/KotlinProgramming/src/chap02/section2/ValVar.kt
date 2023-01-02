package chap02.section2

fun main( ) {
    val number = 10 // number 변수는 Int형으로 추론
    var language = "Korean" // language 변수는 String으로 추론
    val secondNumber: Int = 20 // secondNumber 변수는 자료형을 Int형으로 명시적으로 지정
    language = "English" // var 키워드로 선언한 변수는 값을 다시 할당할 수 있음

    println("number: $number") // number 출력
    println("language: $language") // language 출력 (기존 Korean에서 English로 바뀌었다.)
    println("secondNumber: $secondNumber") // secondNumber 출력
}