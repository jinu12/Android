package com.multicamp.helloworld.oop

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