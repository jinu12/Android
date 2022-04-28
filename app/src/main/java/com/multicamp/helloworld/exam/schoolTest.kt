package com.multicamp.helloworld.exam

fun main() {
    val student = Student("홍길동",20,202001)
    val teacher = Teacher("이순신",30,"java")
    val staff = Staff("유관순",40,"교무과")

    student.print()
    teacher.print()
    staff.print()

}

class Student {
    var name:String= ""
    var age:Int= 0
    var id:Int= 0

    constructor(name:String, age:Int, id:Int) {
        this.name = name
        this.age = age
        this.id = id
    }

    fun print() {
        println("이 름: $name\t 나 이: $age\t 학   번 : $id")
    }

}
class Teacher {
    var name:String= ""
    var age:Int= 0
    var subject:String= ""

    constructor(name:String, age:Int, subject:String) {
        this.name = name
        this.age = age
        this.subject = subject
    }

    fun print() {
        println("이 름: $name\t 나 이: $age\t 담당과목  : $subject")
    }

}
class Staff {
    var name:String= ""
    var age:Int= 0
    var dept:String= ""

    constructor(name:String, age:Int, dept:String) {
        this.name = name
        this.age = age
        this.dept = dept
    }

    fun print() {
        println("이 름: $name\t 나 이: $age\t 학   번 : $dept")
    }

}