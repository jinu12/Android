package com.multicamp.helloworld.oop

fun main() {
    // 사용자정의 클래스를 사용하는 방법
    // 객체 생성 = 클래스의 인스턴스화 작업
    // 정의된 클래스를 실제 프로그램 내부에서 사용하기 위해 메모리에 올려놓는 작업
    val obj1:MyClass = MyClass()
    val obj2 = MyClass() // 객체를 참조하는 변수와 실제 생성되는 객체가 타입이 동일한 경우 참조변수의 타입을 생략할 수있다.
    println("obj1 : $obj1")
    println("obj2 : $obj2")

    val obj3 = Person()
    obj3.name = "jinu"
    obj3.age = 20
    obj3.telNum = 11111

    println(obj3.print())

}

//클래스를 작성하는 방법
class MyClass{

}

class Person{
    // 멤버 변수 정의
    var name = ""
    var telNum = 0
    var age = 0
    // 멤버 메소드 - Person 클래스가 갖고 있는 기능(함수와 동일한 방법으로 정의)
    fun print() {
        println("print=>name:$name, age:$age, telNum:$telNum")
    }
}