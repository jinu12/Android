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