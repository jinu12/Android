package com.multicamp.helloworld.exam

import java.util.*

fun main() {
    start()
}

fun start() {
    println("**********계산기*************")
    println("1. 더하기")
    println("2. 빼기")
    println("3. 곱하기")
    println("4. 나누기")
    print("원하는 작업을 선택하세요:")
    val sc:Scanner = Scanner(System.`in`)
    val choose = sc.nextInt()
    print("숫자1 : ")
    val num1 = sc.nextInt()
    print("숫자2 : ")
    val num2 = sc.nextInt()
    calc(choose,num1,num2)

}

fun calc(choose:Int, num1: Int, num2: Int) {
    var result:Int = 0
    when(choose) {
        1 -> result = num1 + num2
        2 -> result = num1 - num2
        3 -> result = num1 * num2
        4 -> result = num1 / num2
        else -> println("제대로 된 숫자를 입력해주세요")
    }
    println(result)
}

