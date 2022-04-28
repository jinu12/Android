package com.multicamp.helloworld.classExam

class Video:Content {

    var genre:String = ""

    constructor(title:String, genre:String) {
        this.title = title
        this.genre = genre

    }

    override fun totalPrice() {
        if(genre.equals("new")) {
            price = 2000
        }else if(genre.equals("comic")) {
            price = 1500
        }else if(genre.equals("child")) {
            price = 1000
        }else {
            price = 500
        }
    }

}