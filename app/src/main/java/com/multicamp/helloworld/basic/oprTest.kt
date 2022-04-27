package com.multicamp.helloworld.basic

// 연산자

fun main() {
    // 단항 연산자
    // +(양수), -(음수)
    val a1:Int = 10
    val a2:Int = -10

    val r1:Int = -a1
    val r2:Int = -a2

    println("a1:$a1, a2:$a2")
    println("r1:$r1, r2:$r2")

    // ! : true -> false, false -> true
    val a3:Boolean = true
    val a4:Boolean = false

    println("a3:$a3, a4:$a4")
    println("a3:${!a3}, a4:${!a4}")

    var a5:Int = 100
    var a6:Int = 100
    a5++
    a6--
    println("a5:$a5, a6:$a6")

    var y : Int = 0
    var x : Int = 0
    y = 0
    x = 5
    y = ++x
    println("x=$x, y=$y")

    y = 0
    x = 5
    y = x++
    println("x=$x, y=$y")

    y = 0
    x = 5
    y = --x
    println("x=$x, y=$y")

    y = 0
    x = 5
    y = x--
    println("x=$x, y=$y")

    // 산술연산자
    val a7:Int = 10 + 3
    val a8:Int = 10 - 3
    val a9:Int = 10 * 3
    val a10:Int = 10 / 3
    val a11:Int = 10 % 3
    println("$a7, $a8, $a9, $a10, $a11")

    // 숫자의 범위를 관리하는 객체
    val numList:IntRange = 10..20 // 10부터 20까지의 값을 관리하는 객체
    println("numList:$numList")

    // 비교연산자 == : 같다 != : 다르다, >, >=, <, <=
    val num1:Int = 10
    val data1:Boolean = num1 == 10
    val data2:Boolean = num1 != 10
    println("data1: $data1, data2: $data2")




}