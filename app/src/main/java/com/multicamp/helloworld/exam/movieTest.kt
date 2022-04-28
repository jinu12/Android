package com.multicamp.helloworld.exam

fun main() {
    val movie = Movie("어거스트 러쉬", "Drama")
    val movie2 = Movie("나는 전설이다", "SF")
    movie.print()
    println("-------------------")
    movie2.print()
}


class Movie {
    var title:String = ""
    var genre:String = ""
    init {
        println("영화시작")
    }
    constructor(title:String, genre:String) {
        this.title = title
        this.genre = genre

    }

    fun print() {
        println("$title($genre) 상영중입니다.")
    }
}