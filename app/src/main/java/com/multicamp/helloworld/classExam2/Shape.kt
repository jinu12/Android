package com.multicamp.helloworld.classExam2

open abstract class Shape {
    var area:Double = 0.0
    var name:String = ""

    constructor() {

    }
    constructor(name:String) {
        this.name = name
    }

    open abstract fun calculationArea()

    fun print() {
        println("${name}의 면적은 $area")
    }
}