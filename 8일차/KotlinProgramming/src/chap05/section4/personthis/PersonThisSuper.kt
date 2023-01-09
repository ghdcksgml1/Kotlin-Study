package chap05.section4.personthis

open class Person {
    constructor(firstName: String){
        println("[Person] firstName: $firstName")
    }

    constructor(firstName: String, age: Int) { // 3번
        println("[Person] firstName: $firstName, $age")
    }
}

class Developer : Person { // Person과 상속관계
    constructor(firstName: String): this(firstName, 10) { // 1번
        println("[Developer] $firstName")

    }

    constructor(firstName: String, age: Int): super(firstName, age) { // 2번
        println("[Developer] $firstName, $age")

    }

}

fun main() {
    val scan = Developer("Sean")
}