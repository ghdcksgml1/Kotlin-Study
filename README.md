# Kotlin-Study

코틀린 딱대

노션을 그대로 갖다가 복사한거라서 스크린샷이 안보일 수 있습니다.~

<img width="776" alt="스크린샷 2022-12-24 오후 9 47 51" src="https://user-images.githubusercontent.com/79779676/209934309-8d791a42-5ddf-4849-be61-6bbd90e822c6.png">

# 📘 공부 내용정리 - 1일차

---

### 코틀린

- 코틀린은 젯브레인즈에서 개발한 언어
- Kotlin/JVM : 자바 가상 머신에서 동작하는 애플리케이션을 만들 수 있음
- Kotlin/JS : 자바스크립트로 웹 브라우저에서 동작하는 애플리케이션을 만들 수 있음
- Kotlin/Native : LLVM 컴파일러를 이용하여 여러 플랫폼을 타깃으로 하는 애플리케이션을 만들 수 있음

### 코틀린 특징

- 자바와 완벽하게 호환되므로 자바 코드를 완전히 바꾸지 않고도 자바와 혼용할 수 있다.

### 코틀린의 장점

- 자료형 오류를 미리 잡을 수 있는 정적 언어이다. **(컴파일시점에 자료형을 검사하여 확정한다.)**
- 널 포인터 예외로 인한 프로그램의 중단을 예방할 수 있다.
- 아주 간결하고 효율적이다.
- 함수형 프로그래밍과 객체 지향 프로그래밍이 모두 가능하다.
- 세미콜론 생략가능

### 🙌 HelloKotlin

![스크린샷 2022-12-29 오후 4.56.08.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/db9c5ce4-b9ba-44e7-8d93-ce7ace9fab73/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-12-29_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.56.08.png)

![스크린샷 2022-12-29 오후 4.58.43.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ddfaaa2a-76c7-46a5-b441-6e5c370bbe08/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-12-29_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.58.43.png)

```kotlin
// HelloKotlin.kt

fun main(){
	println("Hello Kotlin!")
}

// 실행결과 : Hello Kotlin!
```

**코틀린의 main( ) 함수는 프로그램의 실행 진입점이다.**

자바 같은 객체 지향 언어에서 프로그램을 실행하려면 최소한 하나의 클래스와 그 안에 main( )과 같은 함수가 있어야한다. 하지만 코틀린은 선언한 클래스가 없는데도 불구하고 main( )함수와 println( )함수만 딸랑 존재하는데 “Hello Kotlin”을 출력하고 있다.

```java
// JAVA
class HelloKotlin {

	public static void main(String[] args) {
		System.out.println("Hello Kotlin!");
	}
}
```

ex) 자바에서는 main함수도 다음과같이 클래스 안에 선언해야한다.

그게 가능한 이유는 작성한 코틀린 코드는 **JVM**에서 실행되며, main( ) 함수가 있는 파일 이름을 기준으로 자바 클래스가 자동 생성된다.

### 코틀린 프로젝트의 구성요소

- 프로젝트(Project), 모듈(Module), 패키지(Package), 파일(File)
- 크기 순 : 프로젝트 > 모듈 > 패키지 > 파일 (점점 크기가 좁혀짐)
- default 패키지 설정하는 방법은 코드내부의 package를 지워주면 된다.

```kotlin
// com.example.edu

class Person(val name: String, val age: Int)
```

### 기본 패키지 활용하기

- 기본 패키지란 코틀린으로 프로그램을 만들 때 자주 사용하는 클래스와 함수 등을 미리 만들어 놓은 것이다.
- 패키지는 import 키워드를 통해 선언해서 사용한다.

| 패지지 이름 | 설명 |
| --- | --- |
| kotlin.* | Any, Int, Double 등 핵심 함수와 자료형 |
| kotlin.text.* | 문자와 관련된 API |
| kotlin.sequences.* | 컬렉션 자료형의 하나로 반복이 허용되는 개체를 열거 |
| kotlin.ranges.* | if문이나 for문에서 사용할 범위 관련 요소 |
| kotlin.io.* | 입출력 관려 API |
| kotlin.collections.* | List, Set, Map 등의 컬렉션 |
| kotlin.annotation.* | 애노테이션 관련 API |

```kotlin
// defaultPackage.kt
package chap02.section1

import kotlin.math.PI
import kotlin.math.abs

fun main() {
    val intro: String = "안녕하세요!" // String 자료형 선언
    val num: Int = 20 // Int 자료형 선언

		println(PI)
    println(abs(-12.6))

    println("intro: $intro, num: $num") // 출력 코틀린에서는 $변수명 으로 변수를 출력할 수 있다.
}
```

```kotlin
// UserClassImport.kt
package chap02.section1

import com.example.edu.Person as User // 해당 패키지에 있는 Person 객체를 임포트해온다. 하지만, 이 클래스에서는 User로 이름을 정의한다.

fun main() {
    val user1 = User("Kildong", 30) // name은 "Kildong", age는 30인 객체 생성
		val user2 = Person("A123", "Kildong") // 이 파일 안의 Person 객체 생성
    
    println(user1.name) // user1의 name을 출력
    println(user1.age)  // user1의 age를 출력
		
		println(user2.id) // user2의 id를 출력
    println(user2.name) // user2의 name을 출력
}

class Person(val id: String, val name: String) // 이 파일에서 새로운 Person 객체를 정의한다.
```

### 코틀린으로 백준 Hello World 문제를 풀어보았다.

[2557번: Hello World](https://www.acmicpc.net/problem/2557)

![스크린샷 2022-12-29 오후 6.40.32.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2ea849d3-040f-43e6-a1d8-c2c7e38146eb/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-12-29_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_6.40.32.png)

# 🥲 어려웠던 점 (ex. 에러난 부분)

---

- 아무래도 새로운 언어를 배우다보니까 환경세팅하는게 가장 어려웠다.

# 💡 질문 2개 만들기

---

1. 코틀린의 자료형이 확정되는 시점은 언제인가? **(a,b 중 하나를 고르시오.)**   [       ]
    1. 컴파일 시점
    2. 런타임

1. 아래에 id와 name은 String, age는 Int 자료형인 UserInfor 객체를 만드세요.

```kotlin
// UserInfor.kt

class UserInfor {}
```

---

<aside>
✅ 체크 리스트

- [x]  2시간 이상 공부하셨나요?
- [x]  내용을 정확히 이해했나요?
- [x]  코드에 주석은 달았나요?
</aside>

[Kotlin-Study/1일차 at main · ghdcksgml1/Kotlin-Study](https://github.com/ghdcksgml1/Kotlin-Study/tree/main/1%EC%9D%BC%EC%B0%A8)

<br><br><br><br>

# 📘 공부 내용정리 - 2일차

---

### val과 var의 차이점

- val : 최초로 지정한 변수의 값으로 초기화하고 더 이상 바꿀 수 없는 읽기 전용 변수가 된다. **(java의 final)**
- var : 최초로 지정한 변수의 초깃값이 있더라고 값을 바꿀 수 있다.

**(책에서는 val로 변수를 선언해 놓고, 변경해야 할 때 var로 바꾸는 방법을 권장하고 있음)**

![스크린샷 2022-12-30 오후 1.35.02.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/07309e86-da18-4bbd-8d95-ca369732c613/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-12-30_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_1.35.02.png)

```kotlin
val username = "Kildong" // 코틀린이 자료형을 추론하여 username의 자료형을 String으로 결정한다.
var username // (Error!) 자료형을 지정하지 않은 변수는 사용할 수 없다.
```

**정리 : 값을 할당하지 않으면서 변수를 선언할 수는 없다.**

```kotlin
// ValVar.kt
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
```

### 변수명을 지을 때 주의사항

- 변수 이름은 123abc와 같이 숫자로 시작하면 안 된다.
- 변수 이름에는 while, if와 같이 코틀린에서 사용되는 키워드를 쓸 수 없다.
- 변수 이름은 의미 있는 단어를 사용하여 만드는 것이 좋다.
- 여러 단어를 사용하여 변수 이름을 지을 때 카멜 표기법을 사용하는 것이 좋다. (ex. userName, userInfor)

### 자료형 (참조형과 기본형)

- 기본형 : int, double, long, float **(JAVA 기준)**
- 참조형 : String, Integer, Double, Date **(JAVA 기준)**

코틀린은 참조형만 사용한다. **(기존에 성능 최적화를 위해 참조형을 기본형으로 바꾸는 불필요한 작업을 없애줌.)**

참조형만 사용하는 것 같지만, 컴파일 과정을 거치면 참조형이 기본형으로 바뀐다. (자동으로 최적화 수행)

## 코틀린의 자료형

### 정수 자료형

| 자료형 | 크기 | 값의 범위 |
| --- | --- | --- |
| Long | 8바이트(64비트) | -2^63 ~ 2^63-1 |
| Int | 4바이트(32비트) | -2^31 ~ 2^31-1 |
| Short | 2바이트(16비트) | -2^15 ~ 2^15-1 |
| Byte | 1바이트(8비트) | -2^7 ~ 2^7-1 |

### 부호가 없는 정수 자료형 (unsigned)

| 자료형 | 크기 | 값의 범위 |
| --- | --- | --- |
| ULong | 8바이트(64비트) | 2^64-1 |
| UInt | 4바이트(32비트) | 2^32-1 |
| UShort | 2바이트(16비트) | 2^16-1 |
| UByte | 1바이트(8비트) | 2^8-1 |

💡 **꿀팁 : 언더스코어로 자릿값을 구분할 수 있다.**

```kotlin
val number: Int = 1_000_000 // 백만
```

### 실수 자료형

| 자료형 | 크기 | 값의 범위 |
| --- | --- | --- |
| Double | 8바이트(64비트) | 약 4.9E - 324 ~ 1.7E + 308 |
| Float | 4바이트(32비트) | 약 1.4E - 45 ~ 3.4E + 38 |

```kotlin
val exp01 = 3.14 // Double
val exp02 = 3.14F // Float
```

💡 **꿀팁 : 부동 소수점 옮기기**

```kotlin
val exp03 = 3.14E2 // 314
val exp04 = 3.14E-2 // 0.0314
```

```kotlin
// MinMax.kt
package chap02.section2

fun main() {
    println("Byte min: ${Byte.MIN_VALUE}, max: ${Byte.MAX_VALUE}")
    println("Short min: ${Short.MIN_VALUE}, max: ${Short.MAX_VALUE}")
    println("Int min: ${Int.MIN_VALUE}, max: ${Int.MAX_VALUE}")
    println("Long min: ${Long.MIN_VALUE}, max: ${Long.MAX_VALUE}")
    println("Float min: ${Float.MIN_VALUE}, max: ${Float.MAX_VALUE}")
    println("Double min: ${Double.MIN_VALUE}, max: ${Double.MAX_VALUE}")
}

-- 실행결과 --
Byte min: -128, max: 127
Short min: -32768, max: 32767
Int min: -2147483648, max: 2147483647
Long min: -9223372036854775808, max: 9223372036854775807
Float min: 1.4E-45, max: 3.4028235E38
Double min: 4.9E-324, max: 1.7976931348623157E308
```

### 논리 자료형

| 자료형 | 크기 | 값의 범위 |
| --- | --- | --- |
| Boolean | 1비트 | true, false |

```kotlin
val isOpen = true // Boolean형으로 추론
val isUploaded: Boolean // 변수를 선언만 한 경우 자료형을 반드시 명시
```

### 문자 자료형 (음수 존재 x)

| 자료형 | 크기 | 값의 범위 |
| --- | --- | --- |
| Char | 2바이트(16비트) | 0 ~ 2^15 - 1 |

```kotlin
val ch = 'c' // ch는 Char로 추론
val ch2: Char // 변수를 선언만 한 경우 자료형을 반드시 명시
```

```kotlin
val ch = 'A'
println("${ch + 1}") // B

val chNum: Char = 65 // (Error!) 숫자를 사용하여 선언하는 것은 금지
val code: Int = 65
val chFromCode: Char = code.toChar() // code에 해당하는 문자를 할당
println(chFromCode) // A

val ch4: Char = 'ab' // (Error!) 두개 이상의 문자를 담을 수 없다.
```

```kotlin
// StringTest.kt
package chap02.section2

fun main() {
    var str1: String = "Hello"
    var str2: String = "World"
    var str3: String = "Hello"

    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}")
}

-- 실행결과 --
str1 === str2: false
str1 === str3: true
```

str1과 str3는 같은 문자열을 사용하기 때문에 같은 곳을 참조해서 ‘===’결과 true가 반환됨.

### 형식화된 다중 문자열 출력해 보기

```kotlin
// FormattedString.kt
package chap02.section2

fun main() {
    val num = 10
    val formattedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num)
        """
    println(formattedString)
}

-- 실행결과 --
				var a = 6
        var b = "Kotlin"
        println(a + num)
```

### 자료형에 별명 붙이기

- typealias 라는 키워드를 사용한다.

```kotlin
typealias Username = String // String을 Username이라고 부를게~
val user: Username = "Kildong" // String자료형 선언
```

### null을 허용한 변수 검사하기

- 코틀린은 변수를 사용할 때 반드시 값이 할당되어 있어야 한다는 원칙이 있다.
- 만약 값이 할당되지 않은 변수를 사용하면 코틀린에서 오류가 발생한다.
- null 상태인 변수를 허용하려면 물음표(?) 기호를 사용해 선언해야 한다.

```kotlin
// NullTest.kt
package chap02.section3

fun main() {
    var str1: String = "Hello Kotlin"
    str1 = null // (Error!)
    println("str1: $str1")
}

---------------------------------------

package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1")
}
```

### 세이프 콜

- 세이프 콜이란 null이 할당되어 있을 가능성이 있는 변수를 검사하여 안전하게 호출할 수 있도록 도와주는 기법을 말한다.
- 호출할 변수 뒤에 ?.를 작성하면 된다.

```kotlin
println("str1: ${str1?.length}") // str1을 세이프 콜로 안전하게 호출
```

### non-null 단정 기호

- non-null은 변수에 할당된 값이 null이 아님을 단정하므로 컴파일러가 null 검사 없이 무시한다.
- 하지만, 실행 중에 NPE을 발생시킨다.

### 세이프 콜과 엘비스 연산자를 활용한 안전하게 null 사용하기

- 엘비스 연산자는 변수가 null인지 아닌지 검사하여 null이 아니라면 왼쪽 식을 그대로 실행하고, null이라면 오른쪽 식을 진행한다. (3항 연산자)

```kotlin
// SafeCallandElvis.kt
package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null

    println("str1: $str1 length: ${str1?.length ?: -1}")
}
```

### 자료형 변환

- 코틀린에서는 자바와는 다르게 자료형이 자동으로 변환되지 않는다. 따라서, 자료형을 바꿔주는 메서드를 활용해야한다.

```kotlin
val a: Int = 1
val b: Double = a // (Error!)
val c: Int = 1.1 // (Error!)
---------------------------

val b: Double = a.toDouble()
```

### 이중 등호(==)와 삼중 등호(===)

- 이중등호(==) : 단순히 값만 비교할 때 이중 등호를 사용한다.
- 삼중등호(===) : 값과 상관없이 참조가 동일하면 true를 반환한다.

```kotlin
package chap02.section3

fun main() {
    val a: Int = 128
    val b = a
    println(a === b) // 자료형이 기본형인 int형이 되어 값이 동일하므로 true

    var c: Int? = a
    val d: Int? = a
    val e: Int? = c
    c = 129
    println(c == d) // 값의 내용만 비교하는 경우 동일하므로 true
    println(c === d) // 값의 내용은 같지만 참조 주소를 비교해 다른 객체(주소 다름)이므로 false
    println(c === e) // 값의 내용도 같고 참조된 객체도 동일(주소 동일)하므로 true
}
```

Int?형으로 선언하게되면 참조형으로 저장된다. **(Int형은 겉으론 참조형이지만 자바 클래스 변환과정에서 기본형으로 변환됨.)**

![스크린샷 2022-12-30 오후 4.21.26.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8993646e-82d3-48c0-a96c-4d012a42a803/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-12-30_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.21.26.png)

### 스마트 캐스트

- 어떤 값이 정수일 수도 있고, 실수일 수도 있을 때 그때마다 자료형을 변환해야하는 번거로움을 해소해주는 객체
- Number를 사용한다.

```kotlin
// NumberTest.kt
package chap02.section3

fun main() {
    var test: Number = 12.2
    println("${test}")

    test = 12
    println("$test")

    test = 120L
    println("$test")

    test += 12.0f
    println("$test")
}
```

### 자료형 검사하기 (자바의 instance of)

- 변수의 자료형을 알아낼 때에는 is 키워드를 사용하면 된다.
- is의 왼쪽 항의 변수가 오른쪽 항의 자료형과 같으면 true를, 아니면 false를 반환한다.

```kotlin
package chap02.section3

fun main() {
    val num = 256

    if(num is Int){ // num이 Int일 때
        println(num)
    } else if(num !is Int) { // num이 Int가 아닐 때
        println("Not a Int")
    }
}
```

### as에 의한 스마트 캐스트

- as는 형 변환이 가능하지 않으면 예외를 발생 시킨다.

```kotlin
val x: String = y as String

// y가 null이 아니면 String으로 형 변환되어 x에 할당된다. y가 null이면 형 변환을 할 수 없으므로
// 예외가 발생한다.

// null 가능성까지 고려하여 예외 발생을 피하려고 하는 경우 아래와 같이 작성 가능
val x: String? = y as? String
```

### 묵시적 변환

- Any형은 자료형이 특별히 정해지지 않은 경우에만 사용한다. **(JAVA의 Object와 비슷하다.)**
- 모든 클래스의 부모클래스이다.

```kotlin
// AnyCasting.kt
package chap02.section3

fun main() {
    var a: Any = 1
    a = 20L
    a = "asdfasf" // 어떠한 형 변환을 하더라도 예외가 발생하지 않는다.
    println("a: $a type: ${a.javaClass}")
}
```

```kotlin
// AnyArgTest.kt
package chap02.section3

fun main() {
    check("hello") // 문자열 인자
    check(5) // Int형 인자
}

fun check(x: Any) { // Any이기 때문에 유연하게 인자를 받을 수 있다.
    if (x is String) {
        println("x is String: $x")
    }
    if (x is Int) {
        println("x is Int: $x")
    }

}
```

### 산술 연산자의 종류

![스크린샷 2022-12-30 오후 4.38.26.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bc81fe89-7ec0-48ef-ba70-3fc0819be17a/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-12-30_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.38.26.png)

### 대입 연산자

![스크린샷 2022-12-30 오후 4.40.57.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/74af91da-1b3b-41fa-96fb-24e71d392655/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-12-30_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.40.57.png)

### 증가 감소 연산자

![스크린샷 2022-12-30 오후 4.41.30.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5817352e-098e-4728-86c1-711a88f421c4/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-12-30_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.41.30.png)

### 비교 연산자

![스크린샷 2022-12-30 오후 4.42.07.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c44666cc-0af1-43d8-a589-6073249fb1fa/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-12-30_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.42.07.png)

![스크린샷 2022-12-30 오후 4.42.26.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d5bf07ad-1e46-4194-b8d7-9c76cbacf024/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-12-30_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.42.26.png)

### 논리 연산자

![스크린샷 2022-12-30 오후 4.42.53.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3e3e3407-6d9b-434c-a8bb-77400c6be5a7/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-12-30_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.42.53.png)

### 비트 연산자

![스크린샷 2022-12-30 오후 4.45.40.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8b925abd-773a-4c2e-8c7c-4d688133fc69/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-12-30_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.45.40.png)

```kotlin
// BitsShift.kt
package chap02.section4

fun main() {
    var x = 4
    var y = 0b0000_1010
    var z = 0x0F

    println("x shl 2 -> ${x shl 2}")
    println("x.inv( ) -> ${x.inv()}")

    println("y shr 2 -> ${y/4}, ${y shr 2}")
    println("x shl 4 -> ${x*16}, ${x shl 4}")
    println("z shl 4 -> ${z*16}, ${z shl 4}")

    x= 64
    println("x shr 4 -> ${x/4}, ${x shr 2}")
}

-- 실행 결과 --
x shl 2 -> 16
x.inv( ) -> -5
y shr 2 -> 2, 2
x shl 4 -> 64, 64
z shl 4 -> 240, 240
x shr 4 -> 16, 16

// LogicalBitwise.kt
package chap02.section4

fun main() {
    val number1 = 12
    val number2 = 25
    val result: Int

    result = number1 or number2
    println(result)
}

-- 실행 결과 --
29
```

# 🥲 어려웠던 점 (ex. 에러난 부분)

---

### 이중 등호와 삼중 등호 부분

- 코틀린에서는 모든 변수 선언을 할때 자료형을 참조형으로 선언한다. 코틀린의 참조형은 자바 클래스로 변환 될때에는 기본형으로 바뀌게 되는데, 특이하게 null을 허용하는 변수를 선언할 때에는 자바 클래스로 변환을 하더라고 참조형으로 남아있다.

```kotlin
val x: String? = "abcd"
```

# 💡 질문 2개 만들기

---

1. 아래 코드의 실행결과를 작성하시오.

```kotlin
// StringTest.kt
package chap02.section2

fun main() {
    var str1: String = "Hello"
    var str3: String = "Hello"

    println("str1 === str3: ${str1 === str3}")
}

-- 실행결과 --
str1 === str3: true
```

이번 강의에서 위과 같은 코드가 나왔을때 문자열이 같기 때문에 같은 객체를 가리키므로, 실행결과가 true가 나온것을 알 수 있었다.

**그렇다면, 아래의 실행결과는?**

```kotlin
fun main( ) {
	val num: Int = 3

	val str1: String = "ab$num"
	val str2: String = "ab$num"

	println(str1 === str2)
}

// 실행결과 : 
```

1. xor 연산을 이용해 값을 swap하는 코드를 짜보세요.

```kotlin
fun main {
	var a: Int = 10
	var b: Int = 20

	// 코드삽입 //

	////////////

	println("a: $a")
	println("b: $b")

}
```

---

<aside>
✅ 체크 리스트

- [x]  2시간 이상 공부하셨나요?
- [x]  내용을 정확히 이해했나요?
- [x]  코드에 주석은 달았나요?
</aside>

[Kotlin-Study/2일차/KotlinProgramming at main · ghdcksgml1/Kotlin-Study](https://github.com/ghdcksgml1/Kotlin-Study/tree/main/2%EC%9D%BC%EC%B0%A8/KotlinProgramming)

<br><br><br><br>

# 📘 공부 내용정리

---

![스크린샷 2023-01-02 오전 9.44.01.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cfa23c9d-1944-4363-b0a6-a3dad39373e3/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-01-02_%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB_9.44.01.png)

1. fun 키워드로 함수 선언 시작하기
- 모든 함수는 fun이라는 키워드로 시작한다. 덧셈 함수도 마찬가지로 함수를 선언하기 위하여 fun 키워드를 사용했다.
1. 함수 이름 짓기
2. 매개변수 정의하기
- 매개변수는 쉼표(,)와 함께 여러 개를 지정할 수 있고 반드시 콜론(:)과 함께 자료형을 명시해 주어야 합니다. 덧셈 함수는 a와 b라는 매개변수를 통해 더할 값을 입력받습니다. 매개변수의 자료형은 모두 Int형으로 명시했다.
1. 반환값의 자료형 명시하기
- 함수가 반환하는 값이 있다면 반환값의 자료형도 반드시 명시해야 한다.
1. 함수의 본문 완성하기
2. 값 반환하기
- 반환값이 없다면 이 과정은 생략 가능하다.

```kotlin
fun 함수 이름([변수 이름: 자료형, 변수 이름: 자료형..]): [반환값의 자료형] {
	표현식..
	[return 반환값]
}
```

### sum( ) 함수 선언하고 호출하기

```kotlin
// sumFunc.kt
package chap03.section1

fun sum(a: Int, b: Int): Int = a + b

fun main() {
    val result1 = sum(3, 2)
    val result2 = sum(6, 7)

    println(result1)
    println(result2)
}
```

### 인자와 매개변수의 차이

- 매개변수와 인자는 같은 역할을 하는 것처럼 보이기 때문에 착각하기 쉽다. 하지만 이 둘은 명확하게 구분할 수 있는 개념이다. 함수를 선언할 때는 매개변수라고 함수를 호출할 때는 인자라고 부른다.
- ex) a: Int, b: Int 부분이 매개변수, sum(3, 2)에서 3, 2는 인자

### 함수의 호출과 메모리

```kotlin
// MaxFunc.kt
package chap03.section1

import java.lang.Integer.max

fun main() { // 최초의 스택 프레임
    val num1 = 10
    val num2 = 3
    val result: Int

    result = max(10, 3) // 두 번째 스택 프레임
}

fun max(a: Int, b: Int) = if (a>b) a else b
```

![스크린샷 2023-01-02 오전 10.03.20.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/937c47ab-9f7f-4f58-823e-f839160749b2/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-01-02_%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB_10.03.20.png)

### 반환값이 없는 함수

- 함수의 반환값은 생략할 수 있다. 예를 들어, 두 인자를 그대로 출력하는 함수는 값을 반환하지 않아도 된다.
- return문은 생략할 수 있다. 그 대신 반환값의 자료형을 Unit으로 지정하거나 생략할 수 있습니다.

```kotlin
func printSum(a: Int, b: Int): Unit {
		println("sum of $a and $b is ${a+b}")
}
```

Unit과 void의 차이점

- Unit은 자바의 void형과 대응한다. 하지만 void는 정말로 아무것도 반환하지 않고 Unit은 특수한 객체를 반환한다는 차이점이 있다.

### 매개변수 제대로 활용하기

- 인자가 들어오지 않았을때 default값을 지정할 수 있다.

```kotlin
fun add(name: String, email: String = "default") { }

// email이 인자로 들어오지 않을 경우 email = "default"가 된다.
// 매개변수에 기본값이 들어있지 않을 경우, 모든 인자를 채워넣어줘야 한다.
```

```kotlin
// DefaultParameter.kt
package chap03.section1

fun main() {
    val name = "홍길동"
    val email = "hong@example.kr"

    add(name)
    add(name, email)
    add("둘리", "dooly@example.kr")
    defaultArgs()
    defaultArgs(200)

}

fun add(name: String, email: String = "default") {
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x+y)

}
```

### 매개변수 이름과 함께 함수 호출하기

- 매개변수가 너무 많은 함수를 호출하다 보면 매개변수의 순서가 헷갈릴 수 있다. 그래서 코틀린은 매개변수의 이름과 함께 인자를 전달하는 방법을 제공한다.

```kotlin
// NamedParam.kt
package chap03.section1

fun main() {
    namedParam(x = 200, z = 100)
    namedParam(z = 150) // z는 기본값을 지정하지 않았으므로 꼭 넣어줘야한다.

}

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)

}
```

### 매개변수의 개수가 고정되지 않은 함수 사용하기

- 가변 인자를 사용하면, 같은 역할을 하는데 매개변수만 늘어나는 함수를 한가지 기능으로 묶어줄 수 있다.
- 변수명 앞에 vararg 키워드를 넣어준다.

```kotlin
//VarargsTest
package chap03.section1

fun main() {
    normalVarargs(1,2,3,4)
    normalVarargs(4,5,6)
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        print("$num ")
    }
    println()
}
```

### 함수형 프로그래밍이란?

- 함수형 프로그래밍은 순수 함수를 작성하여 프로그램의 부작용을 줄이는 프로그래밍 기법
- 순수 함수 : 함수에 같은 인자를 넣었을 때 항상 같은 결과를 반환하는 함수 **(부작용이 없는 함수),** 그리고 부작용이 없는 함수는 함수 외부의 어떤 상태도 바꾸지 않는다.
- 순수 함수가 아닌 함수의 예

```kotlin
fun check( ) {
		val test = User.grade( ) // check() 함수에 없는 외부의 User 객체를 사용한다.
		if (test != null) process(test) // 변수 test는 User.grade()의 실행 결과에 따라 달라진다.
}
```

### 람다식

- 다른 함수의 인자로 넘기는 함수
- 함수의 결괏값으로 반환하는 함수
- 변수에 저장하는 함수

```kotlin
{x,y -> x+y}
```

### 일급 객체의 특징

- 일급 객체는 함수의 인자로 전달할 수 있다.
- 일급 객체는 함수의 반환값에 사용할 수 있다.
- 일급 객체는 변수에 담을 수 있다.

람다식의 경우 일급 객체의 특징을 가진 이름 없는 함수

### 고차 함수

- 다른 함수를 인자로 사용하거나 함수를 결괏값으로 반환하는 함수

```kotlin
fun main() {
		println(highFunc({x, y -> x + y}, 10, 20)) // 람다식 함수를 인자로 넘긴다.
}

fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a,b) // sum 매개변수는 함수
```

![스크린샷 2023-01-02 오전 11.01.17.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5b475845-65be-4ed4-a525-145832632513/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-01-02_%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB_11.01.17.png)

### 일반 함수를 인자나 반환값으로 사용하는 고차 함수

```kotlin
// FuncArgument.kt
package chap03.section3

fun main() {
    val res1 = sum(3, 2)
    val res2 = mul(sum(3,3), 2)
    
    println("res1: $res1, res2: $res2")
}

fun sum(a: Int, b: Int) = a+b
fun mul(a: Int, b: Int) = a*b
```

```kotlin
// 변수에 할당하는 람다식 함수 작성하기
// HighOrderTest
package chap03.section3

fun main() {
    var result: Int
    val multi = {x: Int, y:Int -> x * y}
    result = multi(10,20)
    println(result)
}
```

- 람다 표현식 **(아래는 모두 같은 표현이다.)**

```kotlin
val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y} // 생략되지 않은 전체 표현
val multi = {x: Int, y: Int -> x * y} // 선언 자료형 생략
val multi: (Int, Int) -> Int = {x, y -> x * y}
```

- 매개변수에 람다식 함수를 이용한 고차 함수

```kotlin
// HighOrderTest2.kt
package chap03.section3

fun main() {
    var result: Int
    result = highOrder({x,y -> x+y}, 10, 20)
    println(result)
}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a,b);
}
```

- 인자와 반환값이 없는 람다식 함수

```kotlin
// HighOrderTest3.kt
package chap03.section3

fun main() {
    val out: () -> Unit = {println("Hello World!")}

    out()
    val new = out
    new()
}
```

- 값에 의한 호출로 람다식 사용하기

```kotlin
// CallByValue.kt
package chap03.section3

fun main() {
    val result = callByValue(lambda())
    println(result)
}

fun callByValue(b: Boolean): Boolean {
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda function")
    true
}

-- 실행 결과 --
lambda function
callByValue function
true
```

- 람다식 이름을 사용해 호출하기

```kotlin
// CallByName.kt
package chap03.section3

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}

-- 실행 결과 --
callByName function
otherLambda function
true
```

### 다른 함수의 참조에 의한 일반 함수 호출

- 람다식으로 선언한 자리에 일반 함수를 넣어주면 오류가 난다. 하지만 앞에 :: 를 붙여주면 일반함수도 람다식 자리에 넣어줄 수 있다.

```kotlin
// FunctionReference.kt
package chap03.section3

fun main() {
    val res1 = funcParam(3, 2, ::sum2)
    println(res1)
    
    hello(::text) // hello({x,y -> text(x,y)}) 과 같다.
    
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
```

- 람다식의 매개변수 테스트하기

```kotlin
// ParamCount.kt
package chap03.section3

fun main() {
    noParam({ "Hello World!" })
    noParam { "Hello World!" }
}

fun noParam(out: () -> String) = println(out())
```

- 2개의 람다식을 매개변수로 가진 함수의 사용

```kotlin
// TwoLambdaParam.kt
package chap03.section3

fun main() {
    twoLambda({a,b -> "First $a $b"}, {"Second $it"})
    twoLambda({a,b -> "First $a $b"}) {"Second $it"}
}

fun twoLambda(first: (String, String) -> String,
    second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}
```

# 💡 질문 2개 만들기

---

1. 아래와 같이 정의된 람다식 안에 함수 sum을 넣으려면 어떻게 해야하는가?

```kotlin
fun main() {
		println(customFunc([빈칸], 10, 20))
}

fun customFunc(first: (Int, Int) -> Int, a: Int, b: Int): Int {
 		return first(a,b)
}

fun sum(a: Int, b: Int) = a + b

-- 실행 결과 --
30
```

1. 다음 람다식 중 잘못된 람다식은 ?? (p.121 참고)
    1. val lambda = {a: String, b: String → “$a $b”}
    2. val lambda: (String, String) → String = {”$a $b”}
    3. val lambda: (String, String) → String = {a: String, b: String → “$a $b”}

---

<aside>
✅ 체크 리스트

- [x]  2시간 이상 공부하셨나요?
- [x]  내용을 정확히 이해했나요?
- [x]  코드에 주석은 달았나요?
</aside>

[Kotlin-Study/3일차/KotlinProgramming/src/chap03 at main · ghdcksgml1/Kotlin-Study](https://github.com/ghdcksgml1/Kotlin-Study/tree/main/3%EC%9D%BC%EC%B0%A8/KotlinProgramming/src/chap03)
