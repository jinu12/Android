package com.multicamp.helloworld.etc

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