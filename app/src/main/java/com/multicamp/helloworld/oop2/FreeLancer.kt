package com.multicamp.helloworld.oop2

class FreeLancer:Employee {
    var grade:Int= 0

    constructor():super() {

    }


    constructor(name:String, age:Int, grade:Int):super(name, age) {
        this.grade = grade
    }

    override fun print() {
        super.print()
        println("\t 등   급, : $grade")
    }
    override fun test() {
        println("FreeLancer 클래스의 메소드")
    }
}