package com.multicamp.helloworld.classExam

fun main() {
    val obj =Video("변호인","new")
    val obj2 = Video("탐정","comic")
    val obj3 = Video("헬로카봇","child")
    obj.totalPrice()
    obj2.totalPrice()
    obj3.totalPrice()
    obj.show()
    obj2.show()
    obj3.show()
}