package com.multicamp.helloworld.exam

import java.util.*

fun main() {
    val myArr = arrayOf(10, 20, 30, 40, 50)
    printSumArray(myArr)
    println("===============display===============")
    println("결과:${display('9')}")
    println("결과:${display('a')}")
    println("결과:${display(';')}")
    val threeArr = arrayOf(100,90,90,80,97)
    printData(threeArr)
}

fun printSumArray(myArr:Array<Int>) {
    println("===============printSumArray===============")
    println(myArr.sum())
    println(myArr.average())
}

fun display(data:Char) = when(data) {
    in '0'..'9' -> "숫자입니다."
    in 'a'..'z',in 'A'..'Z' -> "문자입니다."
    else -> "판단할 수 없습니다."

}

fun printData(myArr:Array<Int>) {
    println("===============printData===============")
    for(i in myArr) {
        if(i % 3 == 0) {
            println(i)
        }
    }


}
