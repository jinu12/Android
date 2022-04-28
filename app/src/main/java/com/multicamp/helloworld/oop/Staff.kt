package com.multicamp.helloworld.oop

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
        println("이 름: $name\t 나 이: $age\t 부   사 : $dept")
    }

}