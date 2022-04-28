package com.multicamp.helloworld.oop

fun main() {
    val teacher = Teacher("아임스튜던트",27,"math")
    val student = Student("아임티처",37,202101)
    val staff = Staff("아임스테프",47,"mathDept")
    teacher.print()
    student.print()
    staff.print()

}