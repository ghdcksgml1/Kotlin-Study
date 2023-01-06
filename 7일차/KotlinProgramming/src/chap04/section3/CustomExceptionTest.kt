package chap04.section3

import java.lang.Exception

class InvalidNameException(message: String) : Exception(message)

fun main() {
    var name = "Kildong123" // 숫자가 포함된 이름
    try {
        validateName(name)
    } catch (e : InvalidNameException) {
        println(e.message)
    } catch (e : Exception) {
        println(e.message)
    }
}

fun validateName(name : String) {
    if(name.matches(Regex(".*\\d+/*"))) { // 이름에 숫자가 포함되어 있으면 예외 발생
        throw InvalidNameException("Your name : $name : contains numerals.")
    }

}