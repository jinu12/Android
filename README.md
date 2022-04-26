# Android

## 특징

안드로이드가 아직 뭔지 잘 모르는 상태에서 안드로이드의 특징을 살펴본다는 것은 말이 되지 않지만 안드로이드는 잘 모르는 상태에서도 뭘 얘기하는지 알 수도 있는 
독특한 구조로 되어 있다. 리소스의 외부화 바로 이것이다. 안드로이드에서 사용하는 모든 정적 리소스들은 안드로이드 내부 클래스에서 정적 필드로 관리가 된다. 
화면 디자인, 이미지, 배열, 문자열 ... 모든 것이 리소스로 관리된다. 
안드로이드 내부에서 이 리소스를 관리하는 클래스는 R.java이며 이전 버전까지는 R.java를 볼 수 있었으나 안드로이드 스튜디오 3.6이후 버전의 Gradle부터는 내부에서 해당 바이트 
코드를 직접 만들고 중간 파일인 R.java를 만들지 않는다.
이 리소스들을 모아 놓은 폴더가 "res"폴더이다. 기본으로 제공되는 폴더는 drawable, layout, mipmap, values이며 더 추가할 수 있다

- drawable 
  - 일반적으로 이미지 파일을 저장하는 파일   
- layout
  - 안드로이드는 액티비티를 구성하는화면 디자인을 직접 코드로 할 수도 있지만 보통은 xml로 관리하여 이 xml 파일을 저장하는 폴더가 layout 폴더이다.
- mipmap
  - 안드로이드 런처 아이콘을 저장하는 폴더
- values
  - 내가 제작하는 앱에서 자주 사용하는 스타일, 색상, 글꼴, 문자열 등을 등록하는 xml 파일을 저장하는 폴더       

## Kotlin

### 등장 배경

- 젯브라인스에서 오픈소스 그룹을 만들어 개발한 프로그래밍 언어
- 2011년 처음 공개되었으며 2017년 구글에서 안드로이드 공식 언어로 지정하면서 유명
- '자바 Java'가 인도네시아 섬 이름을 따와서 사용했듯이 코틀린Kotlin도 러시아 섬 이름에서 유래
- 코틀린으로 작성한 프로그램은 JVM에서 실행할 수 있음
- 확장자로 .kt 사용
- 코틀린 컴파일러(kotlinc)가 .kt파일을 컴파일하면 자바 바이트코드가 만들어짐
- 자바와 다른 코톨린으로 코드를 작성하지만 컴파일하면 자바 클래스가 만들어지고 이를 JVM이 실행

### 코틀린 이점

- 표현력과 간결함(expressive and concise)
  - 코틀린의 최신 언어 기법을 이용하면 훨씬 간결한 구문으로 프로그램을 작성 
- 안전한 코드(safer code)
  - 널 안전성을 지원하는 언어
  - 객체지향 프로그래밍에서 객체는 널 상태일 수 있으며 이 떄 런타임 오류인 널 포인트 예외가 발생
  - 따라서, 객체가 널인 상황을 고려해 개발해야하는데, 코틀린에서는 변수를 널 혀용과 널 불허용으로 구분해서 선언
  - 이로써 널과 관련된 여러 부분을 컴파일러가 해결
- 상호 운용성(interoperable)
  - 코틀린은 자바와 100% 호환
  - 코틀린으로 프로그램을 작성할 때 자바 클래스나 라이브러리를 얼마든지 활용
  - 코틀린 코드에서 자바 클래스를 이용할 수 있으며 반대로 자바 코드에서 코틀린 클래스를 이용 가능
  - 이미 자바로 개발한 앱을 유지 보수 할 때 추가하는 코드만 코틀린으로 작성할 수도 있음
- 구조화 동시성(structured concurrency)
  - 비동기 프로그래밍을 간소화 할 수 있음
  - 네트워크 연동이나 데이터베이스 갱신과 같은 작업을 할 때 이용하면 프로그램을 조금 더 간단하게 그리고 효율적으로 작성  

### 코틀린 기술 서적

<a href = "https://play.kotlinlang.org/byExample/overview?_gl=1*1mwrjc7*_ga*OTc5MzgzODU3LjE2NTA5NTM2MzU.*_ga_J6T75801PF*MTY1MDk1MzYzNS4xLjEuMTY1MDk1MzY1NS4w&_ga=2.255172992.984976220.1650953636-979383857.1650953635">kotlin 기술 문서 바로보기</a><br>
<a href = "https://developer.android.com/kotlin?hl=ko">안드로이드 코틀린 기술 문서 바로보기</a>

### 코틀린 기초 문법

- 변수
  ```kotlin
  // val(value), var(variable)
  // val 키워드로 선언한 변수는 중간에 값을 변경할 수 없다.(읽기 전용)
  // var 키워드로 선언한 변수는 중간에 값을 변경할 수 있다.(읽기 / 쓰기 가능)
  // 코틀린은 데이터타입을 생략할 수 있고, 선언할 수 있다.
  //선언
  var num = 100
  var data = "my kotlin"
  var point = 10.5
  val myData = 300
  // myData = 500 -> val 키워드는 정의된 변수이므로 중간에 수정이 불가능 
  num = 200

  var num2 : Int = 100
  var data2: String = "my kotlin"
  var point2 : Double = 10.5
  val myData2 : Int = 300

  //활용
  var num3 : Int = 1000
  var num4 : Int = 2000
  val result : Int = num3 + num4

  //변수에 null을 저장하기
  var num5 = 100
  var num6 = null
  var num7:Int = 100

  //null을 허용하지 않는 변수를 정의 - null을 허용하지 않는 변수에 null을 넎는 것은 불가능하다.
  //var num8:Int = null

  //?연산자를 쓰면 null을 허용하겠다는 의미
  var num8:Int ? = null
  println("값:$num7")
  println("값:$num8")

  // null을 허용하지 않는 변수에 null을 허용하는 변수의 값을 저장할 수 없다.(성격이 다르면 값을 할당할 숭 없다.)
  // => num8이 null을 허용하는 변수지만 현재는 null이 아니다라고 설정

  var num9 :Int = num8!!
  // null 허용하지 않는 타입을 맞춰주는 작업(컴파일 오류를 처리하도록)
  //!!는 null을 허용했지만 이 시점에서 null이 아님을 보장하겠다는 의미

  ```
- 함수 
  ```kotlin
  fun main() {
    // 매개변수가 없고 리턴값이 없는 함수의 호출
    test()
    test(1,2)
    test(1.5,2)

    //기본값이 있는 함수를 호출하기
    test(num2=500,num1=100)

    //기본값이 없는 함수는 일부 값만 전달할 수 없습니다. - 기본값이 없는 함수를 호출하는 경우 무조건 매개변수 갯수, 타임이 일치
    //test(num1=1000) // - error
    test(num1=1000.3)
    test(num2=23000000)
  }
  // 매개변수가 없고 리턴값이 없는 함수
  fun test(){
      println("test함수")
  }

  // 매개 변수가 있고 리턴값이 없는 함수
  // 함수명이 같아도 매개변수의 갯수나 매개변수의 타입이 다르면 같은 이름으로 여러 개 함수를 정의할 수 있다. - 오버 로딩
  fun test(num1:Int, num2:Int) {
      println("==========================")
      println("num1$num1")
      println("num2$num2")
      println("==========================")
  }
  
  // 매개변수가 있고 리턴값이 있는 함수를 정의
  fun mytest(num1:Int, num2:Int): Int {
      // 리턴 값의 데이터타입을 표시
      val result = num1 + num2
      return result
  }

  //fun test(num1:Double, num2:Int) {
  //    println("**************************")
  //    println("num1$num1")
  //    println("num2$num2")
  //    println("**************************")
  //}

  fun test(num1:Double=10.0,num2:Int=100000) {
      println("**************************")
      println("num1$num1")
      println("num2$num2")
  }
  ```

