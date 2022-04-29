package com.multicamp.helloworld.function

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