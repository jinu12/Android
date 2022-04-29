package com.multicamp.helloworld.function

fun main() {
    val result1 = test(100, 200)
    val result2 = test1(100, 200)
    val result3 = test2(100, 200)
    println("result1=$result1")
    println("result2=$result2")
    println("result3=$result3")


}

fun test1(num1:Int,num2:Int):Int {
    return num1 + num2
}

fun test2(num1:Int,num2:Int):Int = num1 + num2