package com.tom.student

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("plz enter student name")
    var name = scanner.next()
    print("plz enter english")
    var english = scanner.nextInt()
    print("plz enter english")
    var math = scanner.nextInt()
    val stu = Student(name, english,math)
    stu.print()
}


class Student(var name: String,var english: Int,var math: Int){
    fun print(){
        println(name+"\t"+english+"\t"+math)
    }

}