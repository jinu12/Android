package com.multicamp.helloworld.oop2

class Staff:Employee {
    var dept:String= ""
    constructor():super(){

    }

    constructor(name:String, age:Int, dept:String):super(name, age) {
        this.dept = dept
    }

    override fun print() {
        super.print()
        println("t 부   서 : $dept")
    }
    override fun test() {
        println("Staff 클래스의 메소드")
    }


}