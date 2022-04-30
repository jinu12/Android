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

<a href="./kotlin/kotlinDocs.md"> 바로보기 </a>

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
- Scanner
  ```kotlin
    val sc = Scanner(System.`in`)
    print("문장을 입력해주세요")
    val line = sc.nextLine()
    print("성명: ")
    val name = sc.next()
    print("나이: ")
    val age = sc.nextInt()

    println(line)
    println("name:$name,age:$age")
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
- if 
  ```kotlin
  /*
  val num1:Int = 100

  if(조건) {
      조건이 만족하는 겨우 실행 문장
  }

  if(조건) {
      조건이 만족하는 경우 실행 문장
  }else {
      조건이 만족하지 않는 경수 실행 문장
  }
  if(조건) {

  }else if(조건2) {

  }else if(조건3) {

  }else {

  }
  */
    var sc: Scanner = Scanner(System.`in`)
    print("숫자입력:")
    val num1:Int = sc.nextInt()

    if(num1 == 100) {
        println("조건이 같다.")
    }
    if(num1 != 100) {
        println("조건이 틀리다.")
    }

    if(num1 <= 90) {
        println("성공")
    }else {
        println("실패")
    }

    if(num1>100 || num1 < 0) {
        println("잘못입력했습니다.")
    }else {
        if (num1 >= 90) {
            println("A")
        } else if (num1 >= 80) {
            println("B")
        } else if (num1 >= 70) {
            println("C")
        } else if (num1 >= 60) {
            println("D")
        } else {
            println("F")
        }

    }
  
  ```
- loop
  ```kotlin
      // 반복문
    // for, while, do-while
    // 코드의 반복, 배열과 같은 값을 관리 ..
    // for 문
    /* *for(변수 in 컬랙션) {
            -------------
            배열과 같이 앖을 여러 개 저자알 수 있는 변수
        반복해서 실행할 명령문
     */

    val numList = 1..10
    for (i in numList) {
        println("i:$i")
    }

    println("=====================================")
    val numList2 = 1..10 step 2
    for (i in numList2) {
        println("i:$i")
    }

    println("=====================================")
    val numList3 = 10 downTo 1
    for (i in numList3) {
        println("i:$i")
    }

    println("=====================================")
    val numList4 = 10 downTo 1 step 2
    for (i in numList4) {
        println("i:$i")
    }

    // arrayOf를 이용해서 배열을 생성
    val myArr = arrayOf(10, 20, 30, 40, 50)
    test(myArr)

    // while 문 - 조건을 만족하는 경우 명령문을 반복해서 실행
    /* while(조건식){
            반복해서 실행할 명령문
        }
     */
    // while 문 조건을 만족하지 않으면 {}명령문은 실행할 수 없다.
    println()
    println("++++++++++++++++++++++++++++++++++++++")
    var num1 = 10
    while (num1 < 10) {
        println("$num1")
        num1++
    }
    // 조건이 만족하지 않아도 do while 문을 작성하면
    do {
        println("$num1")
        num1++
    } while (num1 < 10)
  ```
- when 
  ```kotlin
    // when 구문 -> 다중분기(if ~ else, if, switch)
    // 사이값을 비교하는 경우 if~else if
    // 정확하게 일치하는 값을 비교한 값들이 적은 경우 사용
    // when(변수 or 연산식 or 메소드호출문) {
    //  -------------------------------
    //           결과가 값으로 리턴
    // 값1 -> 결과가 값1이면 실행할 명령문
    // 값2 -> 결과가 값2이면 실행할 명령문
    // 값3 -> {
    //       실행할 문장이 여러개인 경우 {}안에 사용가능
    //}
    // 값4, 값4 - > 값4 이거나 값5인 경우 실행할 문장
    // else -> 나머지

    val num1: Int = 4

    when(num1) {
        1 -> println("num1은 1")
        2 -> println("num1은 2")
        3 -> println("num1은 3")
        else -> println("해당 사항 없음")
    }

    when(num1) {
        1 -> println("num1은 1")
        2 -> {
            println("num1은 2")
            println("여러줄 명령문")
        }
        3 -> println("num1은 3")
        4,5 -> println("4이거나 5입니다")
        else -> println("해당사항 없음")
    }

    val num2 = 7
    when (num2) {
        in 1..3 -> println("1부터 3")
        in 4..7 -> println("4부터 7")
        in 8..10 -> println("8부터 10")
    }
  ```
- 코틀린에서 null 관리
  ```kotlin
  // 코틀린에서 Null 관리
  fun main() {
      // null 없는 경우 상관없는데 null 이 있는 경우 에러
      // var num1:Int ? = 10
      // var num2:Int = num1!!
      testnull2("문자열")
      testnull2(null)

      testnull("문자열")
      testnull(null)
  }

  fun testnull(str:String?) {
      val value1:String = str!! // 문법적 오류는 해결, !!는 null에 대한 안정성을 보장 받을 수 없다.
      println("value1:$str") // 문법적
  }
  fun testnull2(str:String?) {
      //
      val value1:String = str?:"기본값" // 변수에 null이 없으면 전달된 값을 할당하고 null이 있는 경우 기본값을 할당할 수 있도록 구현
      println("value1:$str")
  }

  ```
- 생성자
  ```kotlin
    fun main() {
    val obj1 = Customer()
    obj1.name = "hello"
    println("성명:${obj1.name}")
    val obj2 = Customer("jinu",2)
    val obj3 = Customer("hello",3,"010")
    obj1.print()
    obj2.print()
    obj3.print()

  }

  // 생성자 작성 방법 - 1. 기본방법
  /*
  - 생성자는 매개변수 개수, 매개변수 타입을 다르게 추가해서 여러 개를 정의 할 수 있다.
  - 클래스 내부에 생성자를 정의하지 않으면 매개변수가 없는 생성자가 제공된다.
  - 클래스를 정의하면 코틀린 내부에서 자바코드로 변환될 때 자동으로 setter/getter 메소드가 만들어진다.
  */
  class Customer {
    var name:String = ""
    private var age = 0
    private var telNum = ""
    init {
        // 객체가 생성될때 실행해야 하는 기능 - 코틀린에서는 생성자에 멤버변수 초기화를 정의한다.
        println("객체가 생성될때 처리하")
    }
    
    constructor() {
        println("매개변수가 없는 생성자")
    }

    constructor(name:String, age:Int){
        // 생성자 내부에서 멤버변수의 값을 초기화
        this.name = name
        this.age = age
        println("매개변수 2개 생성자")
    }

    constructor(name:String, age:Int, telNum:String) {
        this.name = name
        this.age = age
        this.telNum = telNum
        println("매개변수 3개 생성자")

    }

    fun print() {
        println("print=>name:$name, age:$age, telNum:$telNum")
      }
    }
  ```
- 상속
  ```kotlin
  fun main() {
    var obj = SubA()
    println("===================================")
    println("부모클래스의 멤버:${obj.superVal}")
    obj.superDisplay()
  }
  // 코틀린에서 만드는 클래스는 final 클래스이므로 상속을 하기 위해서는 final 을 해제
  // open 키워드를 클래스 언언부에 추가
  open class SuperA{
      var superVal = 100
      constructor() {
          println("부모클래스의 생성자")
      }
      open fun superDisplay() {
          println("super 클래스의 display()")
      }
  }
  class SubA : SuperA{ //SubA가 SuperA 클래스를 상속한다
      var subVal = 100
      constructor():super() { //SubA의 매개변수 없는 생성자를 호출하기 전에 부모클래스의 생성자를 호출
          println("자식클래스의 생성자")
      }
      fun subDisplay() {
          println("sub클래스이 display()")
      }
      // 메소드 오버라이딩 - 1. override 키워드를 메소드 선우부에 추가
      //                   2. 오버라이드 하려는 부모 클랫의 메소드 선언부에 open을 추가한다.
      //                   3. 부모 클래스의 메소드를 재정의 하면 부모클랫의 메소드가 호출되지 않고 재정의된 메소드가 호출된다.
      override fun superDisplay() {
          println("Super클래스")
      }
  }
  ```
- 람다함수
  ```kotlin
  // 람다함수 => 익명의 함수(함수를 단순하게 표현하는 방법)
  fun main() {
    /*
    fun test1(num1:Int,num2:Int):Int {
        return num1 + num2
    }
     */
    val lambda:(Int,Int) -> Int = {num1:Int,num2:Int -> num1 + num2}
    val result = lambda(100, 200)
    println("result:$result")

    // 코틀린은 유추가 가능하면 생락할 수 있다.
    val lambda2:(Int,Int) -> Int = {num1,num2 -> num1 + num2}
    val result2 = lambda2(300, 200)
    println("result2:$result2")

    // 실행할 명령문이 여러 줄인 경우
    val lambda3 = {num1:Int,num2:Int -> num1 + num2}
    val result3 = lambda3(400, 200)
    println("result3:$result3")

    // 실행할 명령문이 여러 줄인 경우
    val lambda4 = {num1:Int, num2:Int ->
        val re1= num1 + num2
        val re2= num1 + num2
        // 리턴되는 값
        re2 + re1
    }
    val result4 = lambda4(200, 200)
    println("result4:$result4")
    }
  ```

## 개요

### 1. 4대 요소

  - Activity : 화면
  - Serivce : 화면에 보이지 않는 부분
  - Broadcast Receiver : action이 발생했을 때 실행되는 것
  - Content Provider : 데이터 제공

### 2. 구조

1. app
  - manifests : AndroidMainfest.xml 파일이 있으며, 설정 파일
  - java : com.example.플젝트명 패키지 내에 실제 소스 파일들을 구성한다.
  - res
    - 리소스 파일을 모아놓은 곳(주로 정적인 파일, 웹에서, 웹에서 static과 유사)
    - default로 만들어지는 것들 외 여러가지가 들어갈 수 있다.
    - drawable : 그림 관련 파일
    - layout : 화면 구성 관련 파일(웹에서 html 파일을 모아놓는 templates 폴더와 유사)
    - mipmap : 앱 아이콘 파일
    - values : 여러가지 값들을 저장해 놓은 파일, 대표적으로 색깔 문자열을 저장한 파일들이 있다.

## Event 처리

- 각 위젯별로 이벤트가 발생할 때 실행될 리스너의 메소드들이 정의되어 있으며 이벤트를 처리하기 위해서 리스너 상속받아 메소드를 오버라이딩해서 처리하고 싶은 일들을 구현한다.

### click 이벤트인 경우 (권하지 않는 방법)

1. 이벤트가 발생하면 실행될 메소드를 정의
2. 레이아웃 리소스인 xml파일에서 onClick 속성에 메소드를 연결
   - android:onClick = "메소드명"
### 기본 방법 
1. setContentView에 의해서 xml에 등록되어 있는 위젯이 초기화되어 객체로 생성되고 액티비티에 배치되어야 위젯을 가져올 수 있다.
2. 이벤트를 연결하고 싶은 위젯을 멤버변수로 선언
3. findViewById 메소드를 이용해서 해당 id로 정의한 객체를 찾아오기
4. 이벤트가 발생했을때 실행할 기능을 구현하기 위해서 리스너 클래스를 상속해서 이벤트 핸들러 클래스를 만든다.
=> 리스너를 구현한 클래스를 별도의 클래스로 정의해도 좋지만, 이렇게 작업을 하면 액티비티의 위젯들을 컨트롤하기 위해서 엑티비티의 정보를 리스너에 넘겨주어야 한다. (불편)
=> 따라서, 액티비티가 리스너를 상속하도록 작성하는 것이 일반적
5. 뷰(위젯)와 이벤트를 연결한다.
- 뷰객체.setXXXListenr(리스너 객체)
  - 우리가 만든 리스너 클래스를 객체생성해서 연결
  - 액티비티가 리스너를 상송하도록 한 경우, this 입력하면 된다.

### xml 파일을 import해서 처리

- build.grade 파일(모듈)에 플러그인을 등록해서 설치하고 작업해야 한다.(id 'kotlin-android-extensions')
1. 기본 방법과 동일하나
2. xml을 액티비티에서 import하면 findViewById로 xml에 정의된 위젯들을 가져오지 않아도 된다.
3. 바로 xml에서 각각의 뷰에 정의한 id명으로 뷰들을 여결해서 사용할 수 있다.

### 익명 클래스를 만들어서 처리

- 1번과 같은 방법을 사용하면 번거롭다. 따라서, 짧게 작업할 수 있도록 위젯과 익명클래스를 만들고 바로 연결 
- 뷰 객체.setOnClickListener(object:View.OnclickListener) {
                - object 객체는 View.OnClickListener을 상속하는 이름없는 클래스의 객체
                - object 객체는 View.OnClickListener의 하위객체이므로, Context 객체의 하위객체가 X
  override fun onClick(v:View?) {
    버튼이 눌렸을 때 실행할 명령문
  }
}

### 람다를 이용해 익명 클래스를 만들어서 처리

- 3. 의 경우를 람다로 변환하면아래와 같이 실행할 명령문과 {} 안에 넣어줄 수 있다.
뷰객체.setOnClickListener {
  버튼이 눌렸을 때 실행할 명령문
}

```kotlin
package com.multicamp.layout

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_find_view_test.*
import java.util.*

//xml에 추가한 view에 코드를 연결
/*
 1. setContentView에 의해서 xml에 등록되어 있는 위젯이 초기화되어 객체로 생성되고 엑티비티에 배치되어야 위젯을 가져올 수 있다.
 2. 이벤트를 연결하고 싶은 위젯을 멤버변수로 선언
 3. findViewById 메소들르 이용해서 해당 id로 정의한 객체를 찾아오기
 4. 이벤트가 발생했을때 실행될 기능을 구현하기 위해서 리스너 클래스를 상속해서 이벤트 클래스를 만든다.
 5. 뷰(위젯)와 이벤트를 연결한다.
    뷰객체.setXXXListener(리스너객체)
                         ----------
                          우리가 만든 리스너 클래스를 객체 생성해서 연결
 */

class FindViewTestActivity : AppCompatActivity(), View.OnClickListener {
    var mybtn: Button? = null
    var txtresult:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // R 클래스는 안드로이드 내부에서 리소스를 관리하는 객체 - 안드로이드가 자동으로 생성해주는 클래스
        // res 폴더안에 저장하는 모든 파일들, String.xml에 정의하는 문자열, id속성..... 많은 것들을

        setContentView(R.layout.activity_find_view_test)
        // 1) click 이벤트 xml에서 onClick 속성에 메소드를 연결
        // 2) 직접찾아오기
        mybtn = findViewById(R.id.btnClick)
        txtresult = findViewById(R.id.text)

        /*
        var listener = MyListener()
        mybtn?.setOnClickListener(listener)
         */
        btnxmlimport.setOnClickListener(this)
        mybtn?.setOnClickListener(this) // 액티비티이면서 리스너

        btnanonymous.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v:View?) {
                // this는 Context의 하위가 아니라 View.OnclcikListener의 하위이므로 getApplicationContext() 메소드를 이용해서
                // Context 객체를 넘긴다.
                Toast.makeText(applicationContext,"익명클래스로 리스너구현", Toast.LENGTH_LONG).show()
            }

        })
            // 4. 람다로 익명리스너클래스를 만들어서 작업하기
        btnAnonymousLambda.setOnClickListener {
            Toast.makeText(applicationContext, "4번 방법으로 이벤트 처리 완료..", Toast.LENGTH_SHORT).show()
            Log.d("test", "4번 방법으로 이벤트 처리 완료..")
            btnAnonymousLambda.text = "4번 방법으로 이벤트 처리 완료.."
        }
    }

    override fun onClick(v: View?) {
        Log.d( "test",v?.id.toString()) // v.getId()의 결과가 int이므로 toString() 을 호출해서 String 으로 변환
        if(v?.id == R.id.btnClick) {
            mybtn?.text = Date().toString()
            Toast.makeText(this, "android event test...", Toast.LENGTH_LONG).show()
        }else if(v?.id ==R.id.btnxmlimport) {
            result.setImageResource(R.drawable.img01)
        }
    }
}
```