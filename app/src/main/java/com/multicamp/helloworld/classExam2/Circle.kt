package com.multicamp.helloworld.classExam2

import kotlin.math.PI

class Circle:Shape {

    var radius:Double = 0.0

    constructor(radius:Double) {
        this.radius = radius
    }


    override fun calculationArea() {
        area = radius * PI
    }
}