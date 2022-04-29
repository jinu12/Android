package com.multicamp.helloworld.classExam2

class Rectangular:Shape {

    var width:Double = 0.0
    var hight:Double = 0.0
//
    constructor(width:Double, height:Double) {
        this.width = width
        this.hight = height

    }

    override fun calculationArea() {
        area = width * hight
    }
}