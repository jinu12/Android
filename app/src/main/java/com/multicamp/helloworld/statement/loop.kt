package com.multicamp.helloworld.statement

fun main() {
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

}

// Array 객체로 배열을 관리 -> Array에 담을 데이터를 타입을 <>안에 명시
fun test(myArr:Array<Int>){
    for(i in myArr) {
        print("값:$i")
    }
}