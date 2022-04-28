package com.multicamp.helloworld.oop

fun main() {
    var obj = Sub("지누",27)
    println("name:${obj.name}")
}
open class Super(var name:String) {
    init{
        println("test super")
    }
}
class Sub:Super {
    var age:Int = 0
    constructor(name:String,age:Int):super(name) {
        this.name = name
        this.age = age
    }
    init {
        println("test sub")
    }
}