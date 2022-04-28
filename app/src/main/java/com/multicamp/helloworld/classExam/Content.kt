package com.multicamp.helloworld.classExam

open abstract class Content {
    var title:String = ""
    var price:Int = 0
    constructor() {

    }
    constructor(title:String) {
        this.title = title
    }

    open abstract fun totalPrice()

    fun show() {
        println("$title 비디오의 가격은 $price 원 입니다.")
    }
}