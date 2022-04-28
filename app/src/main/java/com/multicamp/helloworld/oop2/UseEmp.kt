package com.multicamp.helloworld.oop2

import java.lang.System.exit
import java.util.*

fun main() {
    while (true) {
        println("""**************인사관리시스템***********
        |1. Teacher
        |2. Staff
        |3. Studnt
        |4. FreeLancer
        |5. Exit
    """.trimMargin())
        var sc = Scanner(System.`in`)
        print("직업선택:")
        var data:Int = sc.nextInt()
        // 상속관계에서 부모탑입의 변수로 자식 객체를 참조할 수 있다.
        // 타입이 부모클래스 타입이면 부모가 갖고 있는 메소드, 속성만 접근할 수 있다.
        var obj:Employee ?= null
        when(data) {
            1 -> obj = Teacher()
            2 -> obj = Staff()
            3 -> obj = Student()
            4 -> obj = FreeLancer()
            5 -> exit(0)
        }
        run(obj!!)
    }
}


fun run(obj: Employee) {
        obj.test()
}
