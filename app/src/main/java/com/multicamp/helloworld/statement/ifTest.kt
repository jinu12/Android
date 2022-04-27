package com.multicamp.helloworld.statement

import java.util.*

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


fun main() {
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
}