package com.multicamp.helloworld.basic

import java.util.*

// 키보드를 입력하면 입력받은 내용으로 Scanner 객체에 메모리에 사용할 수 있는 상태로 생성
fun main() {
    val sc: Scanner = Scanner(System.`in`)
    print("문장을 입력해주세요")
    val line = sc.nextLine()
    print("성명: ")
    val name = sc.next()
    print("나이: ")
    val age = sc.nextInt()

    println(line)
    println("name:$name,age:$age")
}