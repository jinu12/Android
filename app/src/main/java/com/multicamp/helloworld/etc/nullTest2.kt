package com.multicamp.helloworld.etc

// 코틀린에서 null 관리
fun main() {
    // 참조변수를 통해 메소드를 호출하거나
    // ----------
    // 생성된 객체를 접근하는 변수 -> sc
    // ex) sc : Scanner = Scanner(System.`in`)
    testMethod1("안녕하세요") //null이 아닌 값이 전달됐으므로 가능
    println("===============================================")
    testMethod2("안녕하세요") //null이 아닌 값이 전달됐으므로 가능
    testMethod2(null)
    println("===============================================")
    testMethod3("안녕하세요") //null이 아닌 값이 전달됐으므로 가능
    testMethod3(null)
    println("===============================================")
}

//!!를 사용하는 방법은 null이 전달되는 경우 Exception이 발생
fun testMethod1(str:String?) {
    println(str!!.length) // 문자열의 길이를 출력
}

//?.은 null이 아니면 전달된 값으로 길이를 계산하고 null 이면 str?.Length 자체가 null 이 출력된다..
fun testMethod2(str: String?) {
    println("문자열길이:${str?.length}")
}

fun testMethod3(str:String?) {
    if(str is String) {
        println(str.length)
    }
    if(str != null) {
        println(str.length)
    }
}