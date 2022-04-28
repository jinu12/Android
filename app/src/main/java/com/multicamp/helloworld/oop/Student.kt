package com.multicamp.helloworld.oop

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