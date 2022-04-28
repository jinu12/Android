package com.multicamp.helloworld.oop

fun main() {
    var obj = SubA()
    println("===================================")
    println("부모클래스의 멤버:${obj.superVal}")
    obj.superDisplay()
}
// 코틀린에서 만드는 클래스는 final 클래스이므로 상속을 하기 위해서는 final 을 해제
// open 키워드를 클래스 언언부에 추가
open class SuperA{
    var superVal = 100
    constructor() {
        println("부모클래스의 생성자")
    }
    open fun superDisplay() {
        println("super 클래스의 display()")
    }
}
class SubA : SuperA{ //SubA가 SuperA 클래스를 상속한다
    var subVal = 100
    constructor():super() { //SubA의 매개변수 없는 생성자를 호출하기 전에 부모클래스의 생성자를 호출
        println("자식클래스의 생성자")
    }
    fun subDisplay() {
        println("sub클래스이 display()")
    }
    // 메소드 오버라이딩 - 1. override 키워드를 메소드 선우부에 추가
    //                   2. 오버라이드 하려는 부모 클랫의 메소드 선언부에 open을 추가한다.
    //                   3. 부모 클래스의 메소드를 재정의 하면 부모클랫의 메소드가 호출되지 않고 재정의된 메소드가 호출된다.
    override fun superDisplay() {
        println("Super클래스")
    }
}