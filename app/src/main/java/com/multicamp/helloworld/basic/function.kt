package com.multicamp.helloworld.basic

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
    val result = mytest(100,200)
    println("값:$result")
    println("값:${ mytest(100, 200)}")
}

// 매개변수가 없고 리턴값이 없는 함수
fun test(){
    println("test함수")
}

// 매개변수가 있고 리턴값이 있는 함수를 정의
fun mytest(num1:Int, num2:Int): Int {
    // 리턴 값의 데이터타입을 표시
    val result = num1 + num2
    return result
}

// 매개 변수가 있고 리턴값이 없는 함수
// 함수명이 같아도 매개변수의 갯수나 매개변수의 타입이 다르면 같은 이름으로 여러 개 함수를 정의할 수 있다. - 오버 로딩
fun test(num1:Int, num2:Int) {
    println("==========================")
    println("num1$num1")
    println("num2$num2")
    println("==========================")
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