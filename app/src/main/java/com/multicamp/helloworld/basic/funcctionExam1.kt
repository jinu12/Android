package com.multicamp.helloworld.basic

import java.util.*

// 1. 구구단을 입력 받아서 출력할 수 있도록 함수를 정의 하세요.
// 매개변수 : 출력할 단 매개변수는 타입 int 리턴값 : 없음
// 2. 두 수를 입력 받아 더해서 리턴하는 함수를 정의하기
// 매개변수 : 숫자2개
// 리턴값 : 더한 값 리턴할 값은 변수를 선언하고 사용하기 리턴값이 저장되는 변수는 null을 허용하는 변수로 정의하기

// 1.
fun main() {
    val sc:Scanner = Scanner(System.`in`)
    print("단 : ")
    val dan:Int = sc.nextInt()
    multiplication(dan)
    val total : Int = sum(1,5)
    println("total :  $total")
}

fun multiplication(num:Int) {
    for (i in 1..9) {
        val result = num * i
        println("$num * $i = $result" )
    }
}

fun sum(num:Int, num2:Int):Int {
    var result:Int ? = null
    result = num + num2
    return result
}
