package com.multicamp.helloworld.statement

fun main() {
    val str1 = setValue(2)
    println("result1=>$str1")
    println("result2=>${setValue(1)}")
    println("result3=>${setValue(3)}")

    var data:Char = '1'
    var data2:Char = 'A'
    println("data:$data, data2:$data2")
}

// when을 함수의 리턴값으로 사용
fun setValue(num:Int) = when(num) {
    1 -> "문자열1"
    2 -> {
        println("실행할 문장")
        "문자열2"
    }
    else -> "그 외의 값"
}