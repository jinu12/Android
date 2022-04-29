package com.multicamp.helloworld.classExam2

fun main() {

    val circle= Circle(100.00)
    val rectangular = Rectangular(20.00,10.00)
    circle.name = "원"
    rectangular.name = "직사각형"
    circle.calculationArea()
    rectangular.calculationArea()
    circle.print()
    rectangular.print()


}