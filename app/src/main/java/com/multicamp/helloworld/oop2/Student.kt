package com.multicamp.helloworld.oop2

class Student:Employee {
    var id:Int= 0

    constructor():super() {

    }


    constructor(name:String, age:Int, id:Int):super(name, age) {

        this.id = id
    }

    override fun print() {
        super.print()
        println("\t 학   번 : $id")
    }
    override fun test() {
        println("Student 클래스의 메소드")
    }
}